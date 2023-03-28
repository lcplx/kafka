package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaListeners {
    @KafkaListener(topics = "amigoscode",
            groupId = "groupId")
    void listerner(String data) {
        System.out.println("Listern reveciec : " + data);
    }
}
