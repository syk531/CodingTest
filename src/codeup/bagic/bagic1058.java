package codeup.bagic;

import java.util.Scanner;

public class bagic1058 {
    public static void main(String[] args) {
        /*
            두 개의 참(1) 또는 거짓(0)이 입력될 때,
            모두 거짓일 때에만 참이 계산되는 프로그램을 작성해보자.

         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a == 0 && b == 0 ? 1 : 0);
    }
}