package root.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by m on 2016/10/24.
 */
@RestController
public class BootController {
    private static final Logger logger = LoggerFactory.getLogger(BootController.class);

    @RequestMapping("/boot")
    public void test(HttpServletResponse response){
        logger.info("start");
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"msg\":\"succeed999\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("end");
    }

}
