package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc10813 {
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

                int aValue = ballArr[a];
                int bValue = ballArr[b];

                ballArr[a] = bValue;
                ballArr[b] = aValue;
            }

            for(int i=1; i<=n; i++) {
                System.out.print(ballArr[i] + " ");
            }
        } catch (Exception e) {

        }
    }
}
