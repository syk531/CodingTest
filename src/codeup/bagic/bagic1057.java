package codeup.bagic;

import java.util.Scanner;

public class bagic1057 {
    public static void main(String[] args) {
        /*
            두 개의 참(1) 또는 거짓(0)이 입력될 때,
            참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.

         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a == b ? 1 : 0);
    }
}