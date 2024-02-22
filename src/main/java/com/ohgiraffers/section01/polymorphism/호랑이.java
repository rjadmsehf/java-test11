package com.ohgiraffers.section01.polymorphism;

public class 호랑이 extends 동물{


    @Override
    public void 먹기() {
        System.out.println("호랑이가 우걱우걱 먹어요");
    }
    @Override
    public void 달리기() {
        System.out.println("호랑이가 개빠르게 뜁니다");
    }
    @Override
    public void 울기() {
        System.out.println("호랑이가 어흥 하고 웁니다~");
    }
    public void 곶감먹기(){
        System.out.println("호랑이가 곶감을 먹습니다");
    }
}
