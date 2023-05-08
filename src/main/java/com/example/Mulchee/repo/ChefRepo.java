package com.example.Mulchee.repo;

import com.example.Mulchee.model.userbase.usertype.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "chef", path="chef")
public interface ChefRepo extends JpaRepository<Chef, Long> {

}
