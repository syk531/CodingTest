package codeup.bagic;

import java.util.Scanner;

public class bagic1075 {
    public static void main(String[] args) {
        /*
            정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.


            예시
            int n;
            scanf("%d", &n);
            while(n!=0)
            {
              n=n-1; //n--; 와 같다.
              printf("%d", n);
            }



         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = a-1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}