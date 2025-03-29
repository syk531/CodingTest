package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class acmicpc11718 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
