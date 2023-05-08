package com.example.Mulchee.service;

import com.example.Mulchee.model.userbase.usertype.Consumer;
import com.example.Mulchee.repo.ConsumerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    ConsumerRepo consumerRepo;

    public Consumer getConsumerById(long id) {
        return consumerRepo.getReferenceById(id);
    }

    public void addConsumer(Consumer consumer) {
        consumerRepo.save(consumer);
    }

    public void deleteConsumerById(long id) {
        consumerRepo.deleteById(id);
    }
}
