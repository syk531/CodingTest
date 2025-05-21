package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc19532 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strArr = br.readLine().split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            int c = Integer.parseInt(strArr[2]);
            int d = Integer.parseInt(strArr[3]);
            int e = Integer.parseInt(strArr[4]);
            int f = Integer.parseInt(strArr[5]);
            for(int x=-999; x<=999; x++) {
                for(int y=-999; y<=999; y++) {
                    if(a*x + b*y == c && d*x + e*y == f) {
                        System.out.print(x + " " + y);
                        break;
                    }
                }
            }
        } catch (Exception e) {}
    }
}
