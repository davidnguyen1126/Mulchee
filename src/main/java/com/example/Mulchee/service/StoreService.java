package com.example.Mulchee.service;

import com.example.Mulchee.model.store.Store;
import com.example.Mulchee.repo.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreRepo storeRepo;

    public List<Store> getAllStores(){
        return storeRepo.findAll();
    }
    public Store getStoreById(long id) {
        return storeRepo.getReferenceById(id);
    }

    public void addStore(Store store) {
        storeRepo.save(store);
    }

    public void deleteStoreById(long id) {
        storeRepo.deleteById(id);
    }
}
