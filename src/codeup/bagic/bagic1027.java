package codeup.bagic;

import java.util.Scanner;

public class bagic1027 {
    public static void main(String[] args) {
        /*
        년월일(yyyy.mm.dd)를 입력받아,
        일월년(dd-mm-yyyy)로 출력
         */
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        String[] strArr = str.split("\\.");
        System.out.printf("%s-%s-%s", strArr[2], strArr[1], strArr[0]);
    }
}