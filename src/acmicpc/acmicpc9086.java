package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc9086 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            for(int i=0; i<num; i++) {
                String str = br.readLine();
                System.out.println(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1)));
            }

        } catch (Exception e) {

        }
    }
}
