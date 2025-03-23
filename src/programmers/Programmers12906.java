package programmers;

import java.util.ArrayList;
import java.util.List;

public class Programmers12906 {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        int pre = 10000001;
        int cnt = list.size();
        for(int i=0; i<arr.length; i++) {
            if(pre != arr[i]) {
                list.add(arr[i]);
                pre = arr[i];
            }
        }

        int answer[] = new int[cnt];
        for(int i=0; i<cnt; i++) {
            answer[i] = list.get(i);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
