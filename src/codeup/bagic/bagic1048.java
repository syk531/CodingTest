package codeup.bagic;

import java.util.Scanner;

public class bagic1048 {
    public static void main(String[] args) {
        /*
            정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
            0 <= a <= 10, 0 <= b <= 10


            참고
            예를 들어 1 3 이 입력되면 1을 23(8)배 하여 출력한다.

            예시
            int a=1, b=10;
            printf("%d", a << b); //210 = 1024 가 출력된다.

         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d", a<<b);
    }
}