package com.unicoin.java6.Service;

import com.unicoin.java6.Dto.UserDto;
import com.unicoin.java6.Entity.UsersEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getListUser();
    List<UsersEntity> getListUserDetail();
    UserDto getUserByUsername(String username);
    Optional<UsersEntity> getUsernameDetailByUsername(String username);
    UsersEntity createNewUser(UsersEntity users);
    UsersEntity updateUser(UsersEntity usersEntity, String username);
    UsersEntity deleteUser(String username);

}
