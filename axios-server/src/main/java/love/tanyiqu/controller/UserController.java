package love.tanyiqu.controller;

import love.tanyiqu.pojo.User;
import love.tanyiqu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/allUsers")
    public Map<String, Object> all_get() {
        HashMap<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("msg", "请求成功");
        response.put("data", userService.findAll());
        return response;
    }

    @GetMapping("/findById")
    public Map<String, Object> byId(Integer id) {
        HashMap<String, Object> response = new HashMap<>();
        User user = userService.findById(id);
        if (user == null) {
            response.put("code", 200);
            response.put("msg", "结果为空");
            return response;
        }
        response.put("code", 200);
        response.put("data", user);
        return response;
    }

    @PostMapping("/allUsersPost")
    public Map<String, Object> all_post() {
        HashMap<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("msg", "请求成功");
        response.put("data", userService.findAll());
        return response;
    }

    @PostMapping("/findByIdPost")
    public Map<String, Object> byId_post(Integer id) {
        HashMap<String, Object> response = new HashMap<>();
        User user = userService.findById(id);
        if (user == null) {
            response.put("code", 200);
            response.put("msg", "结果为空");
            return response;
        }
        response.put("code", 200);
        response.put("data", user);
        return response;
    }

}
