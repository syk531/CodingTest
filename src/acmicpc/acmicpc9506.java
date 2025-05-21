package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class acmicpc9506 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                int n = Integer.parseInt(br.readLine());
                if(n == -1) {
                    break;
                }

                int sum = 0;
                Queue queue = new PriorityQueue();
                for(int i=1; i<=n/2; i++) {
                    if(n%i == 0) {
                        sum = sum+i;
                        queue.add(i);
                    }
                }

                if(sum == n) {
                    String str = "";
                    while(!queue.isEmpty()) {
                        String element = String.valueOf(queue.poll());

                        if(str.length() == 0) {
                            str = element;
                        } else {
                            str = str + " + " + element;
                        }
                    }
                    System.out.println(n + " = " + str);
                } else {
                    System.out.println(n + " is NOT perfect.");
                }
            }
        } catch (Exception e) {}
    }
}
