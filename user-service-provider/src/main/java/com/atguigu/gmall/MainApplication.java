package com.atguigu.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        // 为了不让程序终止
        System.in.read();
    }

}
