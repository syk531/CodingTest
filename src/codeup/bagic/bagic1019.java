package codeup.bagic;

import java.util.Scanner;

public class bagic1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArr = str.split("\\.");

        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        int c = Integer.parseInt(strArr[2]);

        System.out.printf("%04d.%02d.%02d", a, b, c);
    }
}