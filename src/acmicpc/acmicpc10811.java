package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc10811 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strArr = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);
            int ballArr[] = new int[n+1];

            for(int i=1; i<=n; i++) {
                ballArr[i] = i;
            }

            for(int i=0; i<m; i++) {
                strArr = br.readLine().split(" ");
                int a = Integer.parseInt(strArr[0]);
                int b = Integer.parseInt(strArr[1]);

                int num = 0;
                for(int j = a; j*2<(b+a); j++) {
                    int aValue = ballArr[j];
                    int bValue = ballArr[b-num];

                    ballArr[j] = bValue;
                    ballArr[b-num] = aValue;
                    num++;
                }
            }

            for(int i=1; i<=n; i++) {
                System.out.print(ballArr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
