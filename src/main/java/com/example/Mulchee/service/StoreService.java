package com.example.Mulchee.service;

import com.example.Mulchee.model.store.Store;
import com.example.Mulchee.repo.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {

    @Autowired
    StoreRepo storeRepo;

    public List<Store> getAllStores(){
        return storeRepo.findAll();
    }
    public Optional<Store> getStoreById(long id) {
        return storeRepo.findById(id);
    }

    public Store addStore(Store store) {
       return storeRepo.save(store);
    }

    public void deleteStoreById(long id) {
        storeRepo.deleteById(id);
    }
}
