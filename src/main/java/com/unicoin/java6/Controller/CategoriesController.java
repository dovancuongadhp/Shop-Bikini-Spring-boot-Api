package com.unicoin.java6.Controller;

import com.unicoin.java6.Entity.CategoriesEntity;
import com.unicoin.java6.Service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api-v1/categories")
public class CategoriesController {
    @Autowired
    CategoriesService categoriesService;

    @GetMapping
    public ResponseEntity<List<CategoriesEntity>> getListCategories(){
        return ResponseEntity.ok(categoriesService.getListCategories());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<CategoriesEntity>> getCategoriesById(@PathVariable Integer id){
        return ResponseEntity.ok(categoriesService.getCategoriesById(id));
    }
}
