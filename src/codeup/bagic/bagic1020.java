package codeup.bagic;

import java.util.Scanner;

public class bagic1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replace("-", "");
        System.out.print(str);
    }
}