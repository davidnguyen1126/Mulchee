package com.example.Mulchee.controller;

import com.example.Mulchee.model.userbase.usertype.Chef;
import com.example.Mulchee.service.ChefService;
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
@RequestMapping(path="/chef")
public class ChefController {

    @Autowired
    ChefService chefService;

    @GET
    @RequestMapping("/getAll")
    public ResponseEntity<Map<String, Object>> getAllChefs() {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("Chef", chefService.getAllChefs());
        } catch (Exception e) {
            response.put("Error", e.getCause());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @GET
    @RequestMapping("/getChefById")
    public ResponseEntity<Map<String, Object>> getChefById(@Param("id") long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("Chef", chefService.getChefById(id));
        } catch (Exception e) {
            response.put("Error", e.getCause());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @POST
    @RequestMapping("/addChef")
    public ResponseEntity<String> addChef(@RequestBody Chef chef) {
        try {
            chefService.addChef(chef);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("Chef Added");
    }

    @DELETE
    @RequestMapping("/deleteChefById")
    public ResponseEntity<String> deleteChefById(@Param("id") long id) {
        try {
            chefService.deleteChefById(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("Chef deleted");
    }
}
