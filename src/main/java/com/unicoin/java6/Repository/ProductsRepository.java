package com.unicoin.java6.Repository;

import com.unicoin.java6.Entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsEntity,Integer> {
}
