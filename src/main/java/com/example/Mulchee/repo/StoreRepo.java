package com.example.Mulchee.repo;

import com.example.Mulchee.model.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepo extends JpaRepository<Store, Long> {

}