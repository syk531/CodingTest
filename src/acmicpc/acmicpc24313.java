package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc24313 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strArr[] = br.readLine().split(" ");
            int a1 = Integer.parseInt(strArr[0]);
            int a0 = Integer.parseInt(strArr[1]);
            int c = Integer.parseInt(br.readLine());
            int n0 = Integer.parseInt(br.readLine());

            double answer = (double) a0 / (c-a1);
            int test = 0;
            if(answer <= n0) {
                test = 1;
            }
            System.out.println(test);

        } catch (Exception e) {

        }
    }
}
