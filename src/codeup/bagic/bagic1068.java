package codeup.bagic;

import java.util.Scanner;

public class bagic1068 {
    public static void main(String[] args) {
        /*
            점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.


            평가 기준
            점수 범위 : 평가
             90 ~ 100 : A
             70 ~   89 : B
             40 ~   69 : C
               0 ~   39 : D
            로 평가되어야 한다.

            참고
            여러 조건들을 순서대로 비교하면서 처리하기 위해서 조건문을 중첩할 수 있다.
            만약, 순서대로 검사하고 실행하기 위해 아래와 같이 중첩 시킨다면,

            if(조건1)
            {
              ...
            }
            else
            {
              if(조건2)
              {
                ...
              }
              else
              {
                ...
              }
            }

            중첩된 구조는 논리적으로 1단위이기 때문에 코드블록 기호를 생략하면
            아래와 같은 구조로 다시 표현될 수 있다.

            if(조건1) { ... ; }
            else if(조건2) { ... ; }
            else { ...; }

            이와 같이 조건을 계속 붙여나가면..

            if(조건1) { ... ; }
            else if(조건2) { ... ; }
            else if(조건3) { ... ; }
            else if(조건4) { ... ; }
            else if(조건5) { ... ; }
            else if(조건6) { ... ; }
            else if(조건...) { ... ; }
            else { ... ; }

            위와 같은 구조를 만들어 순서대로 조건을 검사할 수 있다.
            어떤 조건이 참이면, 그 부분의 내용을 실행하고 조건/선택 구조를 빠져나간다.

            이렇게 조건들을 순서대로 검사할 때에는
            중간에 범위가 빠지지 않았는지 꼼꼼하게 생각하고 조건들을 만드는 것이 중요하다.
            이는 마치 수학에서 빠진 범위 없이 부등식을 만드는 것과 유사하다.



         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 90 ) {
            System.out.println("A");
        } else if(90 > a && a >= 70 ) {
            System.out.println("B");
        } else if(70 > a && a >= 40 ) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }
}