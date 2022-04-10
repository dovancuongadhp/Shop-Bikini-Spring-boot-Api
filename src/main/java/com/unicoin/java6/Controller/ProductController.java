package com.unicoin.java6.Controller;

import com.unicoin.java6.Entity.ProductsEntity;
import com.unicoin.java6.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api-v1/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("")
    public ResponseEntity<List<ProductsEntity>> getListProducts(){
        return ResponseEntity.ok(productService.getListProduct());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProductsEntity>> getProductById(@PathVariable Integer id){
        return ResponseEntity.ok(productService.getProductById(id));
    }
    @PostMapping
    public ResponseEntity<ProductsEntity> createProduct(@RequestBody ProductsEntity productsEntity){
        return ResponseEntity.ok(productService.createProduct(productsEntity));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProductsEntity> updateProduct(@RequestBody ProductsEntity productEntity, @PathVariable Integer id){
        return ResponseEntity.ok(productService.updateProduct(productEntity,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ProductsEntity> deleteProduct(@PathVariable Integer id){
        return ResponseEntity.ok(productService.deleteProduct(id));
    }
}
