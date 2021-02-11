package love.tanyiqu.service;

import love.tanyiqu.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAll();


    User findById(Integer id);

}
