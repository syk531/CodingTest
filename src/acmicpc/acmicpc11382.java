package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc11382 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            String[] strArr = str.split(" ");
            long sum = Long.parseLong(strArr[0]) + Long.parseLong(strArr[1]) + Long.parseLong(strArr[2]);
            System.out.print(sum);
        } catch (Exception e) {

        }
    }
}
