package com.unicoin.java6.Controller;

import com.unicoin.java6.Entity.UsersEntity;
import com.unicoin.java6.Exception.MyResourceNotFoundException;
import com.unicoin.java6.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api-v1/userdetail")
public class UserDetailController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<List<UsersEntity>> getListUser() {
        return ResponseEntity.ok(userService.getListUserDetail());
    }

    @GetMapping("/{username}")
    public ResponseEntity<Optional<UsersEntity>> getUserByUserName(@PathVariable String username) {
        Optional<UsersEntity> user = userService.getUsernameDetailByUsername(username);
        return ResponseEntity.ok(user);
    }

    @PostMapping("")
    public ResponseEntity<UsersEntity> createNewUser(@RequestBody UsersEntity users) {
        return ResponseEntity.ok(userService.createNewUser(users));
    }

    @PutMapping(value = "/{username}", consumes = {"application/json"})
    public ResponseEntity<UsersEntity> updateUser(@RequestBody UsersEntity usersEntity,@PathVariable String username) {
        return ResponseEntity.ok(userService.updateUser(usersEntity,username));
    }


    @DeleteMapping("/{username}")
    public ResponseEntity<UsersEntity> deleteUser(@PathVariable String username){
        return ResponseEntity.ok(userService.deleteUser(username));
    }



}
