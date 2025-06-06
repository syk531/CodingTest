package codeup.bagic;

import java.util.Scanner;

public class bagic1061 {
    public static void main(String[] args) {
        /*
            입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
            비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.


            ** | 은 파이프(pipe)연산자라고도 불리는 경우가 있다.

            ** 비트단위(bitwise) 연산자는,
            ~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
            <<(bitwise left shift), >>(bitwise right shift)
            가 있다.

            예를 들어 3과 5가 입력되었을 때를 살펴보면
            3     : 00000000 00000000 00000000 00000011
            5     : 00000000 00000000 00000000 00000101
            3 | 5 : 00000000 00000000 00000000 00000111
            이 된다.

            비트단위 or 연산은 둘 중 하나라도 1인 자리를 1로 만들어주는 것과 같다.

            이러한 비트단위 연산은 빠른 계산이 필요한 그래픽처리에서도 효과적으로 사용된다.

         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", a|b);
    }
}