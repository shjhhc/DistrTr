package root.module.common.secure;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * Created by m on 2016/10/28.
 */
@Service
public class SampleService {
    @Secured("ROLE_USER")
    public String secure(){
        return "Hello Security";
    }

    @PreAuthorize("true")
    public String authorized(){
        return "Hello World";
    }

    @PreAuthorize("false")
    public String denied() {
        return "Goodbye World";
    }
}
