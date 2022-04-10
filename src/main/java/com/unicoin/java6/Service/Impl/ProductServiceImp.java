package com.unicoin.java6.Service.Impl;

import com.unicoin.java6.Entity.ProductsEntity;
import com.unicoin.java6.Repository.ProductsRepository;
import com.unicoin.java6.Service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<ProductsEntity> getListProduct() {
        return productsRepository.findAll();
    }

    @Override
    public Optional<ProductsEntity> getProductById(Integer id) {
        Optional<ProductsEntity> productEntity = productsRepository.findById(id);
        if (productEntity.isPresent()) {
            return productEntity;
        }
        return null;
    }

    @Override
    public ProductsEntity createProduct(ProductsEntity product) {
        return productsRepository.save(product);
    }

    @Override
    public ProductsEntity updateProduct(ProductsEntity product, Integer id) {
        Optional<ProductsEntity> productsEntity = productsRepository.findById(id);
        if (productsEntity.isPresent()) {
            BeanUtils.copyProperties(productsEntity, product);
            return productsRepository.save(product);
        }
        return null;
    }

    @Override
    public ProductsEntity deleteProduct(Integer id) {
        Optional<ProductsEntity> productsEntity = productsRepository.findById(id);
        if (productsEntity.isPresent()) {
            productsRepository.deleteById(id);
        }
        return null;
    }
}
