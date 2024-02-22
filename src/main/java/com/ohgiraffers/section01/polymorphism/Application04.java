package com.ohgiraffers.section01.polymorphism;

public class Application04 {

    public static void main(String[] args) {

        /* 목표 다형성을 적용해서 리턴타입에 활용할 수 있다. */

        /* 목차 랜덤동물() 메소드 추가 */

        /* 목차 1. 랜덤동물() 호출 */
        Application04 app4 = new Application04();

        동물 randomAnimal = app4.랜덤동물();

        randomAnimal.울기();
    }

    public 동물 랜덤동물() {
        int 랜덤 = (int)(Math.random() * 2 ) + 0;

        return 랜덤 == 0 ? new 토끼() : new 호랑이();
    }
}
