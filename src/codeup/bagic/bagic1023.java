package codeup.bagic;

import java.util.Scanner;

public class bagic1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArr = str.split("\\.");
        System.out.println(strArr[0]);
        System.out.print(strArr[1]);
    }
}