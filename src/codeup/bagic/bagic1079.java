package codeup.bagic;

import java.util.Scanner;

public class bagic1079 {
    public static void main(String[] args) {
        /*
            'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.


         */
        Scanner sc = new Scanner(System.in);

        while(true) {
            String s = sc.next();
            char c = s.charAt(0);
            System.out.println(c + " ");
            if(c == 'q') break;
        }
    }
}