package com.example.Mulchee.repo;

import com.example.Mulchee.model.userbase.UserBase;
import com.example.Mulchee.model.userbase.usertype.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConsumerRepo extends JpaRepository<Consumer, Long> {
    Optional<UserBase> findByEmail(String email);
}