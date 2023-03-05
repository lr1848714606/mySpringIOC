package com.xiaoran.springioc.entity;

import com.xiaoran.springioc.annotation.Component;
@Component
public class MyService {
    private int id;
    private String name;
    private int age;
    public void speck(String name,int age) {
        System.out.println("大家好,我叫"+name+"今年"+age+"岁了,请多多关照!");

    }
}
