package com.example.Mulchee.repo;

import com.example.Mulchee.model.userbase.usertype.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepo extends JpaRepository<Consumer, Long> {

}