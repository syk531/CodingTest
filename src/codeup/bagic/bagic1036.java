package codeup.bagic;

import java.util.Scanner;

public class bagic1036 {
    public static void main(String[] args) {
        //16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(Integer.valueOf(s.charAt(0)));
    }
}