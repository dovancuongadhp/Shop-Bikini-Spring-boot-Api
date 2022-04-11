package com.unicoin.java6.Service.Impl;

import com.unicoin.java6.Entity.CategoriesEntity;
import com.unicoin.java6.Repository.CategoriesRepository;
import com.unicoin.java6.Service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesServiceImp implements CategoriesService {
    @Autowired
    CategoriesRepository categoriesRepository;

    @Override
    public List<CategoriesEntity> getListCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public Optional<CategoriesEntity> getCategoriesById(Integer id) {
        return categoriesRepository.findById(id);
    }
}
