package love.tanyiqu.service.impl;

import love.tanyiqu.dao.UserDAO;
import love.tanyiqu.pojo.User;
import love.tanyiqu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDAO.findById(id);
    }
}
