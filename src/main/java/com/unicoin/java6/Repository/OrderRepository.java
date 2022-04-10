package com.unicoin.java6.Repository;

import com.unicoin.java6.Entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrdersEntity,Integer> {
}
