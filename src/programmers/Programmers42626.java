package programmers;

import java.util.PriorityQueue;

public class Programmers42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int minScoville = 0;
        int secondScoville = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++) {
            queue.add(i);
        }

        while(true) {
            minScoville = queue.poll();

            if(minScoville >= K) {
                break;
            } else if (queue.size()  == 0) {
                answer = -1;
                break;
            } else {
                secondScoville = queue.poll();
                int newScoville = (secondScoville * 2 + minScoville);
                queue.add(newScoville);
                answer++;
            }
        }

        return answer;
    }
}
