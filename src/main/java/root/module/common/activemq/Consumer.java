package root.module.common.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by m on 2016/10/25.
 */
@Component
public class Consumer {
    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text){
        System.out.println(text);
    }
}
