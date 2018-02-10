package com.mttsui.hr.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zsxu2
 * @Date 2018/2/6 16:36
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "hello";
    }
}
