package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class acmicpc7785 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            List list = new ArrayList<>();
            for(int i=0; i<n;i++) {
                String[] strArr = br.readLine().split(" ");
                String name = strArr[0];
                if("enter".equals(strArr[1])) {
                    list.add(name);
                } else {
                    list.remove(name);
                }
            }
            list.sort(Comparator.reverseOrder());
            for(int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }

        } catch (Exception e) {}
    }
}

