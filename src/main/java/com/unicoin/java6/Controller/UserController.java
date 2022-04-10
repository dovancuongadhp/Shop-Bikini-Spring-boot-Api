package com.unicoin.java6.Controller;

import com.unicoin.java6.Dto.UserDto;
import com.unicoin.java6.Entity.UsersEntity;
import com.unicoin.java6.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api-v1/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("")
    public ResponseEntity<List<UserDto>> getListUser(){
        List<UserDto> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{username}")
    public ResponseEntity<UserDto> getUserByUserName(@PathVariable String username){
        UserDto user = userService.getUserByUsername(username);
        return ResponseEntity.ok(user);
    }


}
