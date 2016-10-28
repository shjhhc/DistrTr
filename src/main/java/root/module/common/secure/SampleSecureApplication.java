package root.module.common.secure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import root.system.config.init.tomcat.TomcatConfig;

/**
 * Created by m on 2016/10/28.
 */
@EnableAutoConfiguration
@ComponentScan
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
@Import(TomcatConfig.class)
public class SampleSecureApplication implements CommandLineRunner {
    @Autowired
    private SampleService service;

    @Override
    public void run(String... strings) throws Exception {
        SecurityContextHolder.getContext()
                .setAuthentication(new UsernamePasswordAuthenticationToken("user", "N/A",
                        AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER")));
        try {
            System.out.println(this.service.secure());
        } finally {
            SecurityContextHolder.clearContext();
        }
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleSecureApplication.class, "--debug");
    }
}
