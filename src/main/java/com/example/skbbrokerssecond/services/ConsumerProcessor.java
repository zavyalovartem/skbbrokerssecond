package com.example.skbbrokerssecond.services;

import com.example.skbbrokerssecond.models.IncomingMessage;
import com.example.skbbrokerssecond.models.ToSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.function.Consumer;

@Service
public class ConsumerProcessor {

    @Autowired
    Sender sender;

    @Bean
    public Consumer<IncomingMessage> provide(){
        return consumer -> {
            var message = new ToSend(consumer.getId(), "VALID", LocalDateTime.now().toString(), "test");
            sender.publishProcessed(message);
        };
    }
}
