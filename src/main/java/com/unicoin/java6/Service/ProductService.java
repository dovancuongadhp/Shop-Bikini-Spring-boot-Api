package com.unicoin.java6.Service;

import com.unicoin.java6.Entity.ProductsEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductsEntity> getListProduct();
    Optional<ProductsEntity> getProductById(Integer id);
    ProductsEntity createProduct(ProductsEntity product);
    ProductsEntity updateProduct(ProductsEntity product,Integer id);
    ProductsEntity deleteProduct(Integer id);
}
