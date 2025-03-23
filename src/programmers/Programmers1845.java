package programmers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Programmers1845 {
    public int solution(int[] nums) {
        int answer = 0;

        int a = nums.length / 2;
        Set set = new HashSet();

        for(int i=0; i<nums.length; i++) {
            set.add(i);
        }


        answer = Math.min(set.size() / 2 , a);

        return answer;
        //1,2,3,4 > 종류 4, 길이/2=2, 답2
        //1,1,1,2,2,2 > 종류 2, 길이/2=3, 답2
    }
}
