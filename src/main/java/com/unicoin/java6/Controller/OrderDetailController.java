package com.unicoin.java6.Controller;

import com.unicoin.java6.Entity.OrderdetailsEntity;
import com.unicoin.java6.Service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api-v1/orderdetails")
public class OrderDetailController {
    @Autowired
    OrderDetailService orderDetail;

    @GetMapping
    public ResponseEntity<List<OrderdetailsEntity>> getListOrders(){
        return ResponseEntity.ok(orderDetail.getListOrder());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<OrderdetailsEntity>> getOrderById(@PathVariable Integer id){
        return ResponseEntity.ok(orderDetail.getOrderById(id));
    }
    @PostMapping
    public ResponseEntity<OrderdetailsEntity> createOrderDetail(@RequestBody OrderdetailsEntity orderdetails){
        return ResponseEntity.ok(orderDetail.createOrder(orderdetails));
    }
    @PutMapping("/{id}")
    public ResponseEntity<OrderdetailsEntity> updateOrderDetail(@RequestBody OrderdetailsEntity orderdetails, @PathVariable Integer id){
        return ResponseEntity.ok(orderDetail.updateOrder(orderdetails,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<OrderdetailsEntity> deleteOrderDetail(@PathVariable Integer id){
        return ResponseEntity.ok(orderDetail.deleteOrder(id));
    }
}
