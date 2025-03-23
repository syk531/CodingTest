package programmers;

import java.util.Stack;

public class Programmers12909 {
    boolean solution(String s) {
        boolean answer = true;

        Stack stack = new Stack();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(1);
            } else if (c == ')') {
                if(stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) {
            answer = false;
        }

        return answer;
        // ( insert ) pop
    }
}
