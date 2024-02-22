package com.ohgiraffers.interfaceimplements;

public class Product extends Object implements InterProduct{
    @Override
    public void nonStaticMethod() {

        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출됨...");

    }

    @Override
    public void absMethod() {

        System.out.println("InterProduct의 absMethode 오버라이딩한 메소드 호출됨...");

    }
    /* 필기 static 메소드는 오버라이딩 할 수 없다. */
//    @Override
//    public static void staticMethod(){}

    /* 필기
        클래스에서 인터페이스를 상속 받을 때에는 implements 키워드를 사용한다.
        또한 인터페이스는 여러 개를 상속 받을 수 있다. (다중 상속)
        extends로 다른 클래스를 상속 받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능하다.
        단, extends 키워드를 앞에 작성하고 implements 를 뒤에 작성 해야  한다. (아니면 에러 발생)
     */


}
