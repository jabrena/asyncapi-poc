package com.asyncapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageHandlerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageHandlerService.class);

    
      
    
    public void handle(Message<?> message) {
        LOGGER.info("handler hello");
        LOGGER.info(String.valueOf(message.getPayload().toString()));
    }
      
    

}
