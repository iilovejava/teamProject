package com.lanou.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lanou on 2018/7/25.
 */
public class UserController {
    @RequestMapping("login")
    public String login(){
        System.out.println("hahahaheiehi");
        return "login";
    }
}
