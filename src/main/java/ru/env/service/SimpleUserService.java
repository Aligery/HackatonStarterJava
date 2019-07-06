package ru.env.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.env.DTO.SimpleTestUser;
import ru.env.DTO.UsersWithProducts;
import ru.env.mapper.SimpleUserMapper;

import java.util.List;

@Service
public class SimpleUserService {

    @Autowired
    SimpleUserMapper userDao;

    public List<SimpleTestUser> getAllUsers() {
        return userDao.getAllUsers();
    }

    public List<UsersWithProducts> getAllUsersWithProducts() {
        return userDao.getUsersWithProducts();
    }


}
