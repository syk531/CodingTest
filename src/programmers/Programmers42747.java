package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Programmers42747 {
    public int solution(int[] citations) {
        Integer[] intArr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(intArr, Collections.reverseOrder());

        int answer = 0;

        for(int i=0; i<intArr.length; i++) {
            if(intArr[i] < i+1 ) {
                answer = i;
                break;
            }

            if(i == intArr.length-1) {
                answer = intArr.length;
            }
        }

        return answer;
    }
}
