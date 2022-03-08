package top.lovezhangli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Desc: B
 * Author: Xu He
 * created: 2021/8/9 14:35
 */

@Service
public class B {
    public B() {
        System.out.println("B no args constructor");
    }

    @Autowired
    private A a;

    @Transactional
    public void doSomething() {
        System.out.println("B do something");
        a.doSomeThing();
    }
}
