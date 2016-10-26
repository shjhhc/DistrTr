package root.system.config.init.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import root.system.init.filter.SessionFilter;

/**
 * Created by m on 2016/10/25.
 */
@Configuration
public class FilterConfig {
    @Bean
    public SessionFilter sessionServlet(){
        SessionFilter sessionFilter = new SessionFilter();
        return sessionFilter;
    }
}
