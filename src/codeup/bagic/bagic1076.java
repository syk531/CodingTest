package codeup.bagic;

import java.util.Scanner;

public class bagic1076 {
    public static void main(String[] args) {
        /*
            영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.


            참고
            do
            { //코드블록
              ...
            }while(조건); //do~while( ) ; 구조는 반드시 마지막에 세미콜론(;)을 붙여야 한다.
            구조를 사용하자.

            do
            { //코드블록
              ...
            }while(조건);
            구조는 while( ) { ... } 과 유사한 반복 실행 구조를 만들 수 있는데
            다른 점은 무조건 한 번은 실행된다는 것이다. 마지막에 세미콜론을 반드시 붙여야 한다.

            예시
            char x, t='a';
            scanf("%c", &x);
            do
            {
              printf("%c ", t);
              t+=1; //t+=1; 는 t=t+1과 같은 의미이다.
            }while(t<'z'+1); //의미 : t의 값이 'z'보다 작은 동안 반복된다.

            ** 복합 대입 연산자에 대해...
            컴퓨터의 세상에서 반복되는 것은 다시 쓰기 귀찮다.
            즉, 어딘가에 정의가 되어있다면 재사용하던가, 아니면 보다 간단히 쓰고 싶어한다.

            복합 대입 연산자는 대입 연산자를 함께 사용해 보다 간단히 표현하는 방법이다.
            예를 들어 어떤 연산자 X와 대입 연산자를 합쳐 "X="라고 표현하면,
            이는 X 연산 후 대입하라는 의미를 간단히 나타내는 것이다.

            +=, -=, *=, /=, %= ... 등의 형태들이 모두 가능하며 의미는 아래와 같다.

            예를 들어

            n = n + 3;
            은
            n += 3; 으로 간단히 표현할 수 있다.

            n = n << 1;
            는
            n <<= 1; 로 간단히 표현할 수 있다.

            아래는 서로 다른 형태이지만 같은 기능을 하는 코드들이다.
            n++;
            n=n+1;
            n+=1;


         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char strChar = str.charAt(0);
        char a = 'a';


        for(int i = (int) a; i <= (int)strChar; i++) {
            System.out.print((char) i + " ");
        }
    }
}