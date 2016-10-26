package root.module.calc.service.impl;

import root.module.calc.service.CalcService;
import org.springframework.stereotype.Service;

/**
 * Created by m on 2016/10/23.
 */
@Service
public class CalcServiceImpl implements CalcService {
    public void testSpring(String name) {
        if (name.equals("shjh")){
            System.out.println(name.toCharArray().length);
        }else{
            System.out.println(name + ", GOOD");
        }
    }
}
