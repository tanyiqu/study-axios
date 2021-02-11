package love.tanyiqu.dao.impl;

import love.tanyiqu.dao.UserDAO;
import love.tanyiqu.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "张三", 18, "男"));
        users.add(new User(2, "张四", 19, "女"));
        users.add(new User(3, "张五", 20, "男"));
        users.add(new User(4, "张六", 21, "女"));
        users.add(new User(5, "张七", 17, "男"));
    }


    @Override
    public List<User> findAll() {
        return users;
    }


    @Override
    public User findById(Integer id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
