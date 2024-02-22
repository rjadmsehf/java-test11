package com.ohgiraffers.section04.usee;

public class RacingCar extends Car implements Soundable {

    @Override
    public void go() {
        System.out.println("다비켜~~");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카 멈춰유~");

    }

    @Override
    public void sound() {
        System.out.println("레이싱카 경적");
    }
}
