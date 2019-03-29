package com.baidu.Example;

import com.baidu.Example.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //能正确地获取用户！！！！
    @RequestMapping("/getUser")
    public @ResponseBody
    User sayHello(){

        User xiaoming = new User();
        xiaoming.setAge(10);
        xiaoming.setName("xiaoming");
        return xiaoming;
    }

    //能正确的增加用户！！！！！！
    @RequestMapping("/addUser")
    public @ResponseBody
    String addUser(@RequestBody User user){


        System.out.println("增加用户：name"+user.getName()+"    age:"+user.getAge());

        return "{\"status\":\"success\"}";
    }


}
