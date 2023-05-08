package com.example.Mulchee.repo;

import com.example.Mulchee.model.userbase.usertype.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefRepo extends JpaRepository<Chef, Long> {

}
