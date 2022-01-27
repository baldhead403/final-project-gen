package com.finalproject.Fantastic.Footwear.controller;

import com.finalproject.Fantastic.Footwear.model.Shoes;
import com.finalproject.Fantastic.Footwear.repositories.ShoeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class ShoeController {

    final ShoeRepository shoeRepository;

    public ShoeController(ShoeRepository shoeRepository) {
        this.shoeRepository = shoeRepository;
    }

    @CrossOrigin("*")
    @GetMapping("/api/shoes")
    public Iterable<Shoes> getAllShoes(@RequestHeader(value = "Authorization") String authToken){
        System.out.println(authToken);
        String token = authToken.substring(7);
        System.out.println(token);
        return  shoeRepository.findAll();
    }

    @GetMapping("/api/shoes/{id}")
    public Optional<Shoes> findShoesById(@PathVariable("id") Long id){
        return shoeRepository.findById(id);
    }

    @PostMapping("/api/shoes")
    public void saveShoes(@RequestBody Shoes shoes){
        shoeRepository.save(shoes);
    }
}
