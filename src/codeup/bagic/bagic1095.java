package codeup.bagic;

import java.util.Scanner;

public class bagic1095 {
    public static void main(String[] args) {
        /*
            정보 선생님은 오늘도 이상한 출석을 부른다.

            영일이는 오늘도 다른 생각을 해보았다.
            출석 번호를 다 부르지는 않은 것 같은데... 가장 빠른 번호가 뭐였지?

            출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.


            참고
            배열에 순서대로 기록해 두면, 기록된 내용을 모두 검사해 가장 작은 값을 찾아내면 된다.

            그런데, 가장 작은 값은 어떻게 어떤 것과 비교하고 찾아야 할까?

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++) {
            min = Math.min(min, sc.nextInt());
        }

        System.out.println(min);
    }
}