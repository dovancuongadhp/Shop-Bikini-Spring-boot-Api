package com.unicoin.java6.Repository;

import com.unicoin.java6.Entity.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<CategoriesEntity,Integer> {
}
