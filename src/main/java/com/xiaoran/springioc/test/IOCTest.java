package com.xiaoran.springioc.test;

import com.xiaoran.springioc.entity.MyController;
import com.xiaoran.springioc.ioc.MyIOC;
import org.junit.Test;
import java.io.FileNotFoundException;
public class IOCTest {
    @Test
    public void test() throws FileNotFoundException, IllegalAccessException {
        MyIOC myIOC = new MyIOC();
        MyController myController = (MyController)myIOC.getInstance(MyController.class.getName());
        myController.test();

    }
}
