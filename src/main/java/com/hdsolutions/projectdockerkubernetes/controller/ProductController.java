package com.hdsolutions.projectdockerkubernetes.controller;

import com.hdsolutions.projectdockerkubernetes.entities.Product;
import com.hdsolutions.projectdockerkubernetes.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private ProductRepository repo;

    @GetMapping("/info")
    public String getInfo(){
        return "I run app from docker container!!!";
    }


    @GetMapping("/ajout")
    public String ajoutProduit(){
        Product prd = repo.save(Product.builder().id(UUID.randomUUID().toString()).name("Tomato").price(3459).build());
        return prd.getName();
    }

    @GetMapping("/all")
    public List<Product> getProducts(){
        return repo.findAll();
    }
}
