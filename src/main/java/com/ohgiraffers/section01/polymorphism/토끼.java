package com.ohgiraffers.section01.polymorphism;

public class 토끼 extends 동물{


    @Override
    public void 먹기() {
        System.out.println("토끼가 풀을 먹어연 챱챱");
    }
    @Override
    public void 달리기() {
        System.out.println("토끼는 깡총~~깡총~ 뛰댕깁니다");
    }
    @Override
    public void 울기() {
        System.out.println("토끼가 울음소리를 냅니다 끼끼이이익");
    }
    public void 점프() {
        System.out.println("토끼가 점프를 합니다 ,.,.");
    }
}
