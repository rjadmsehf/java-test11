package com.ohgiraffers.section04.usee;

public class Application {
    public static void main(String[] args) {
        FireCar fc = new FireCar();
        fc.go();
        fc.stop();
        fc.sound();

        RacingCar rc = new RacingCar();
        rc.go();
        rc.stop();
        rc.sound();
    }
}
