package com.example.Mulchee.service;

import com.example.Mulchee.model.userbase.usertype.Chef;
import com.example.Mulchee.repo.ChefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChefService {

    @Autowired
    ChefRepo chefRepo;

    public List<Chef> getAllChefs() {
        return chefRepo.findAll();
    }

    public Chef getChefById(long id) {
        return chefRepo.getReferenceById(id);
    }

    public void addChef(Chef chef) {
        chefRepo.save(chef);
    }

    public void addFoodOfferings(long foodId) {

    }

    public void deleteChefById(long id) {
        chefRepo.deleteById(id);
    }

    public void deleteAll() {
        chefRepo.deleteAll();
    }
}
