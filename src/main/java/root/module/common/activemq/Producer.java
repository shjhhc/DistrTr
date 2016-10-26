package root.module.common.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * Created by m on 2016/10/25.
 */
@Component
public class Producer implements CommandLineRunner {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;

    @Override
    public void run(String... strings) throws Exception {
        send("Sample message");
        System.out.println("Message was sent to the Queue");
    }

    private void send(String msg) {
        jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }
}
