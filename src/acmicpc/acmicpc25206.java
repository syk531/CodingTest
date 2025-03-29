package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class acmicpc25206 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[][] strArr = new String[5][15];

            for(int i=0; i<5; i++) {
                char[] charArr = br.readLine().toCharArray();
                for(int j=0; j<charArr.length; j++) {
                    strArr[i][j] = String.valueOf(charArr[j]);
                }
            }

            String answer = "";
            for(int index=0; index<15; index++) {
                for(int i=0; i<5; i++) {
                    if(strArr[i][index] != null) {
                        answer += strArr[i][index];
                    }
                }
            }

            System.out.println(answer);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
