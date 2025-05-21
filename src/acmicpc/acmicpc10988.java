package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc10988 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            //length 5, 5/2 = 2, 4/2 = 2
            int answer = 1;
            int length = str.length();
            for(int i =0; i<str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(length - i - 1)) {
                    answer = 0;
                    break;
                }
            }

            System.out.print(answer);

        } catch (Exception e) {

        }
    }
}
