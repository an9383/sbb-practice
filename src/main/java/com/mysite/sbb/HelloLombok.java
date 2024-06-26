package com.mysite.sbb;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HelloLombok {
    private final String hello;
    private final int lombok;

    private String hello2;

    public String getHello2() {
        return hello2;
    }

    public void setHello2(String hello2) {
        this.hello2 = hello2 + " TEST2";
    }

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("HELLO", 5);
        helloLombok.setHello2("HELLO2");

//        System.out.println(helloLombok.getHello());
//        System.out.println(helloLombok.getLombok());
        System.out.println(helloLombok.getHello2());
    }
}
