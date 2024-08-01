package com.oyq.controller;

import com.oyq.domain.User;
import com.oyq.exception.NameNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/register",produces="text/html;charset=UTF-8")
    public String RegisterUser(User user) throws NameNull {
//        User user = new User(username, password, againPassword, sex);

        System.out.println("register");

        System.out.println(user.toString());

//        int a = 1 / 0;


//        throw new NameNull();
        return "register success";
    }

    @RequestMapping("/loginPage")
    public String loginPage(){
        return "login.html";
    }
}
