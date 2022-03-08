package top.lovezhangli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Desc: A
 * Author: Xu He
 * created: 2021/8/9 14:35
 */
@Service
public class A {
    public A() {
        System.out.println("A no args constructor");
    }

    @Autowired
    private B b;

    @Transactional
    public void doSomeThing() {
        System.out.println("A do Something...");
        b.doSomething();
    }

}
