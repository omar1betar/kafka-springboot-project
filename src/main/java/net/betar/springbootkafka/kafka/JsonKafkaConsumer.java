package net.betar.springbootkafka.kafka;

import net.betar.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "json",groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("json message recived -> %s ",user.toString()));

    }

}
