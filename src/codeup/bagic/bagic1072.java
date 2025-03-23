package codeup.bagic;

import java.util.Scanner;

public class bagic1072 {
    public static void main(String[] args) {
        /*
            n개의 정수가 순서대로 입력된다.
            -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.

            n개의 입력된 정수를 순서대로 출력해보자.

            while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.


            예시
              int n, m;
//              scanf("%d", &n);
            reget: //레이블은 콜론( : ) 으로 끝난다.
              scanf("%d", &m);
              printf("%d\n", m);
              if(n-- != 0) goto reget; //reget:으로 이동, n의 값 1만큼 감소

         */
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            System.out.println(b);
        }
    }
}