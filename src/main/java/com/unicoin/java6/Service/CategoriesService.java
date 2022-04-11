package com.unicoin.java6.Service;

import com.unicoin.java6.Entity.CategoriesEntity;

import java.util.List;
import java.util.Optional;

public interface CategoriesService {
    List<CategoriesEntity> getListCategories();
    Optional<CategoriesEntity> getCategoriesById(Integer id);
}
