package top.lovezhangli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lovezhangli.service.A;

/**
 * Desc: HelloController
 * Author: Xu He
 * created: 2021/8/20 11:38
 */

@RestController
public class HelloController {
    @Autowired
    private A a ;

    public HelloController() {
        System.out.println("HelloController");
    }

    @GetMapping("/hello")
    public String hello(){
        a.doSomeThing();
        return "hello";
    }
}
