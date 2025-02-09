package com.javanik.in.Efficient.Data.Pipeline.writer;

import com.javanik.in.Efficient.Data.Pipeline.entity.Customer;
import org.springframework.batch.item.Chunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

@Component
public class KafkaItemWriter implements ItemWriter<Customer> {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topicName;



    @Override
    public void write(Chunk<? extends Customer> chunk) throws Exception {
        for (Customer customer : chunk) {
            kafkaTemplate.send(topicName, customer);
        }

    }
}
