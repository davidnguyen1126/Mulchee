package com.example.Mulchee.controller;

import com.example.Mulchee.model.userbase.usertype.Consumer;
import com.example.Mulchee.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GET
    @RequestMapping("/getConsumerById")
    public ResponseEntity<Map<String, Object>> getConsumerById(@Param("id") long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("Consumer", consumerService.getConsumerById(id));
        } catch (Exception e) {
            response.put("Error", e.getCause());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @POST
    @RequestMapping("/addConsumer")
    public ResponseEntity<String> addConsumer(@RequestBody Consumer consumer) {
        try {
            consumerService.addConsumer(consumer);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("Consumer Added");
    }

    @DELETE
    @RequestMapping("/deleteConsumerById")
    public ResponseEntity<String> deleteConsumerById(@Param("id") long id) {
        try {
            consumerService.deleteConsumerById(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("Consumer deleted");
    }
}
