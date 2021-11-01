package org.movies.notifications;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {


    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receiveMessage(String message){
        System.out.println("Received: <" + message + ">");
    }

}
