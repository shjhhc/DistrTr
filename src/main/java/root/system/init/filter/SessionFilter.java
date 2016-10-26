package root.system.init.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by m on 2016/10/25.
 */
public class SessionFilter implements Filter {
    private final Logger logger = LoggerFactory.getLogger(SessionFilter.class);

    private String sessionKey;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        sessionKey = "shjh";
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();
        Object obj = session.getAttribute(sessionKey);
        if (obj == null){
            Enumeration<String> enumeration = session.getAttributeNames();
            while (enumeration.hasMoreElements()){
                session.removeAttribute(enumeration.nextElement());
            }
            session.invalidate();
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            logger.info("succeed session");
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
