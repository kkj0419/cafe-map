package com.study.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class TestController {


    @GetMapping("/")
    public String main() {
        return "maps";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login/kakao")
    public String kakaoLogin(@RequestParam("code") String code) {
        System.out.println("code : " + code);
        return "maps";
    }

//    @RequestMapping("/user/logout")
//    public String logout(){
//
//    }

}
