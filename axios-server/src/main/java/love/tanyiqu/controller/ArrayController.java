package love.tanyiqu.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/array")
public class ArrayController {


    @PostMapping("/post")
    public Map<String, Object> post(Integer[] ids) {
        HashMap<String, Object> response = new HashMap<>();
        System.out.println("params: " + Arrays.toString(ids));
        response.put("code", 200);
        response.put("msg", "请求成功");
        response.put("data", ids);
        return response;
    }

}
