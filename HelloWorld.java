import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.*;
public class HelloWorld {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUri("amqp://user1:pass1@localhost:15672//");
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            for(int i=0; i<200;i++) {
                String message = "This is message number "+i;
                channel.basicPublish("dir1", "", null, message.getBytes("UTF-8"));
                System.out.println(" [x] Sent '" + message + "'");
            }
    }
}
