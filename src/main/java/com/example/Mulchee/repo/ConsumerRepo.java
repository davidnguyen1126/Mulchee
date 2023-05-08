package com.example.Mulchee.repo;

import com.example.Mulchee.model.userbase.usertype.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "consumer", path="consumer")
public interface ConsumerRepo extends JpaRepository<Consumer, Long> {

}