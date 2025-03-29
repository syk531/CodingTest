package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc11005 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String strArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);

            String arr[] = new String[37];
            for(int i =0; i<36; i++) {
                if(i>=10) {
                    arr[i] = String.valueOf( (char) (i + 55) );
                } else {
                    arr[i] = String.valueOf(i);
                }
            }

            String answer = "";
            int mock = n;
            int numuge = 0;
            while(mock > 0) {
                numuge = mock % b;
                mock = mock / b;
                answer = arr[numuge] + answer;
            }

            System.out.print(answer);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
