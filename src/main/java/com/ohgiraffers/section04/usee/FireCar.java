package com.ohgiraffers.section04.usee;

public class FireCar extends Car implements Soundable{



    @Override
    public void go() {
        System.out.println("소방차가 가유~ ");

    }

    @Override
    public void stop() {
        System.out.println("소방차 멈춰유~ ");

    }

    @Override
    public void sound() {
        System.out.println("다비켜~ 빵빵~");

    }
}
