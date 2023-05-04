package com.example.Mulchee.repo;

import com.example.Mulchee.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path="users")
public interface UsersRepo extends JpaRepository<Users, Long> {


}
