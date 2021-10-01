package com.cxw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {
    @GetMapping
    public String acb(){
        System.out.println("hello");
        System.out.println("hello-master");
        System.out.println("hello-hot-fix");
        System.out.println("push-hot-fix");

        return "";
    }

}
