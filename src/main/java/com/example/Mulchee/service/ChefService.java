package com.example.Mulchee.service;

import com.example.Mulchee.model.userbase.usertype.Chef;
import com.example.Mulchee.repo.ChefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.core.Response;
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
    public Chef addChef(Chef chef) {
        Chef savedChef = chefRepo.save(chef);
        return savedChef;

    }

    public void deleteChefById(long id) {
        chefRepo.deleteById(id);
    }

    public void deleteAll() {
        chefRepo.deleteAll();
    }
}
