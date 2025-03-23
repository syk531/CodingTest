package codeup.bagic;

import java.util.Scanner;

public class bagic1078 {
    public static void main(String[] args) {
        /*
            정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.


            참고
            while( ) {...}, do {...} while( );, for(...; ...; ...) {...} 등의 반복문은 형태만 다르
            고, 똑같은 성능을 발휘한다. 필요에 따라 편리한 것으로 골라 사용하면 된다.

            예시
            //아래의 예는 홀수일 경우만 더해 그 결과를 출력한다.
            int sum=0;
            int i, n;
            scanf("%d", &n);
            for(i=1; i<=n; i++)
            {
              if(i%2==1) sum=sum+i;
            }


         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for(int i=2; i<=a; i+=2) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}