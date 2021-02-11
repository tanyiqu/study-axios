package love.tanyiqu.dao;

import love.tanyiqu.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDAO {

    List<User> findAll();


    User findById(Integer id);

}
