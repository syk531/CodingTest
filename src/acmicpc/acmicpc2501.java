package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc2501 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String strArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int k = Integer.parseInt(strArr[1]);

            int cnt = 0;
            int answer = 0;
            for(int i=1; i<=n; i++) {
                if(n%i == 0) {
                    cnt++;
                }

                if(cnt == k) {
                    answer = i;
                    break;
                }
            }

            System.out.println(answer);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
