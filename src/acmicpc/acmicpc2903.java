package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc2903 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int xCnt = 1;
            for(int i=0; i<n; i++) {
                xCnt = xCnt * 2;
            }
            System.out.print((xCnt + 1) * (xCnt + 1));
        } catch (Exception e) {}
    }
}
