package com.example.Mulchee.controller;

import com.example.Mulchee.model.store.Store;
import com.example.Mulchee.model.userbase.usertype.Chef;
import com.example.Mulchee.service.ChefService;
import com.example.Mulchee.service.StoreService;
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
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @Autowired
    ChefService chefService;

    @GET
    @RequestMapping("/getAllStores")
    public ResponseEntity<Map<String, Object>> getAllStores(){
        Map<String,Object> response = new HashMap<>();
        try {
            response.put("Store", storeService.getAllStores());
        } catch (Exception e) {
            response.put("error", e.getCause());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @GET
    @RequestMapping("/getStoreById")
    public ResponseEntity<Map<String, Object>> getStoreById(@Param("id") long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("Store", storeService.getStoreById(id));
        } catch (Exception e) {
            response.put("Error", e.getCause());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @POST
    @RequestMapping("/addStore")
    public ResponseEntity<Map<String,Object>> addStore(@RequestBody Store store) {
        Map<String, Object> response = new HashMap<>();
        try {
            Chef newChef = chefService.getChefById(store.getChefId());
            Store result = storeService.addStore(store);

            response.put("store", result);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @DELETE
    @RequestMapping("/deleteStoreById")
    public ResponseEntity<String> deleteStoreById(@Param("id") long id) {
        try {
            storeService.deleteStoreById(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("Store deleted");
    }
}