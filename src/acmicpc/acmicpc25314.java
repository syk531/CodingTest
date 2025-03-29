package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc25314 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            for(int i=0; i<Integer.parseInt(str)/4; i++) {
                System.out.print("long ");
            }

            System.out.print("int");
        } catch (Exception e) {

        }
    }
}
