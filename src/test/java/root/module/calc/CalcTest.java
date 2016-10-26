package root.module.calc;

import root.module.calc.service.CalcService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import system.BaseTest;

/**
 * Created by m on 2016/10/23.
 */
public class CalcTest extends BaseTest {
    @Autowired
    private CalcService calcService;

    @Test
    public void testSpring(){
        calcService.testSpring("shjh");
    }
}
