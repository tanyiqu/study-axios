package love.tanyiqu.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@CrossOrigin
@RequestMapping("/array")
public class ArrayController {


    @PostMapping("/post")
    public String post(Integer[] ids) {
        System.out.println("params: " + Arrays.toString(ids));
        return "array post success";
    }

}
