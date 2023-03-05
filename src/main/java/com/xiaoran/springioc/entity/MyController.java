package com.xiaoran.springioc.entity;

import com.xiaoran.springioc.annotation.Autowired;
import com.xiaoran.springioc.annotation.Component;

@Component
public class MyController {
    @Autowired
    private MyService myService;
    public void test(){
        myService.speck("moss",67);
    }
}
