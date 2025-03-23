package codeup.bagic;

import java.util.Scanner;

public class bagic1054 {
    public static void main(String[] args) {
        /*
            두 개의 참(1) 또는 거짓(0)이 입력될 때,
            모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.


            참고
            논리연산자 && 는 주어진 2개의 논리값이 모두 참(1) 일 때에만 1(참)로 계산하고,
            그 외의 경우에는 0(거짓) 으로 계산한다.

            이러한 논리연산을 AND 연산이라고도 부르고, · 으로 표시하거나 생략하며,
            집합 기호로는 ∩(교집합, intersection)을 의미한다. 모두 같은 의미이다.

            참, 거짓의 논리값(boolean value)인 불 값을 다루어주는 논리연산자는
            !(not), &&(and), ||(or) 이 있다.

            ** 불 대수(boolean algebra)는 수학자 불이 만들어낸 것으로
            참/거짓만 가지는 논리값과 그 연산을 다룬다.

            예시
            printf("%d", 1&&1); //둘 다 참을 의미하므로 1로 계산되어 출력된다.

         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a == 1 && b == 1 ? 1 : 0);
    }
}