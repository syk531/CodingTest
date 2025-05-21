package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class acmicpc9063 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;

            for(int i=0; i<n; i++) {
                String[] strArr = br.readLine().split(" ");
                int x = Integer.parseInt(strArr[0]);
                int y = Integer.parseInt(strArr[1]);

                minX = Math.min(x, minX);
                minY = Math.min(y, minY);
                maxX = Math.max(x, maxX);
                maxY = Math.max(y, maxY);
            }

            System.out.println((maxX - minX) * (maxY - minY));
        } catch (Exception e) {}
    }
}
