package com.unicoin.java6.Service;

import com.unicoin.java6.Entity.OrderdetailsEntity;

import java.util.List;
import java.util.Optional;

public interface OrderDetailService {
    List<OrderdetailsEntity> getListOrder();
    Optional<OrderdetailsEntity> getOrderById(Integer id);
    OrderdetailsEntity createOrder(OrderdetailsEntity orderdetailsEntity);
    OrderdetailsEntity updateOrder(OrderdetailsEntity orderdetailsEntity, Integer id);
    OrderdetailsEntity deleteOrder(Integer id);
}
