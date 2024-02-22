package com.ohgiraffers.section01.polymorphism;

public class Application03 {

    public static void main(String[] args) {

        /* 목표 다형성을 적용해서 매개변수로 활용할 수 있다. */
        /* 목차 1. 하단에 먹이주기() 메소드 만들기 */

        /* 목차 2. 먹이주기() 메소드 호출 */
         Application03 app3 = new Application03();
          동물 a1 = new 토끼();
          동물 a2 = new 호랑이();

          app3.먹이주기(a1);
          app3.먹이주기(a2);

          토끼 r1 = new 토끼();
          호랑이 t1 = new 호랑이();

          app3.먹이주기((동물)r1);     // << 필기 동물이 들어가있다고 생각하면됨 동물 자식클래스가 토끼 호랑이 때문에
          app3.먹이주기(t1);

          app3.먹이주기(new 토끼());
          app3.먹이주기(new 호랑이());  //<< 필기 인스턴스 선언과 동시에
    }
    /* 필기 다형성을 적용하지 않았다면, 호랑이에게 먹이를 주는 메소드와 토끼에게 먹이를 주는 메소드를
            두 개 다 만들어야 한다.
            즉 , 생산성이 좋아졌다고 보면 된다.
     */
    public void 먹이주기(동물 animal){  // << 필기 동물 타입을 가져와  라고 하는 메소드
         animal.먹기();
    }

}
