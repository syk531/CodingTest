package codeup.bagic;

import java.util.Scanner;

public class bagic1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        System.out.println("[" + Integer.parseInt(String.valueOf(str.charAt(0))) * 10000 + "]");
        System.out.println("[" + Integer.parseInt(String.valueOf(str.charAt(1))) * 1000 + "]");
        System.out.println("[" + Integer.parseInt(String.valueOf(str.charAt(2))) * 100 + "]");
        System.out.println("[" + Integer.parseInt(String.valueOf(str.charAt(3))) * 10 + "]");
        System.out.println("[" + Integer.parseInt(String.valueOf(str.charAt(4))) + "]");
    }
}