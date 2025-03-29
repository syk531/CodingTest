package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc10810 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strArr = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);
            int ballArr[] = new int[n+1];
            for(int i=0; i<m; i++) {
                strArr = br.readLine().split(" ");
                int start = Integer.parseInt(strArr[0]);
                int end = Integer.parseInt(strArr[1]);
                int ballNum = Integer.parseInt(strArr[2]);

                for(int j=start; j<=end; j++) {
                    ballArr[j] = ballNum;
                }
            }

            for(int i=1; i<=n; i++) {
                System.out.print(ballArr[i] + " ");
            }
        } catch (Exception e) {

        }
    }
}
