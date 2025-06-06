package codeup.bagic;

import java.util.Scanner;

public class bagic1071 {
    public static void main(String[] args) {
        /*
            정수가 순서대로 입력된다.
            -2147483648 ~ +2147483647, 단 개수는 알 수 없다.

            0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
            while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.


            참고
            goto 명령문을 사용하면 간단한 반복 실행을 만들 수 있다.
            반복 실행 부분을 빠져나오기 위해(즉 무한 반복을 방지하기 위해)
            반복 실행 되는 도중에 조건을 검사해야 한다.

            goto 이름:
            이 명령은 이름: 이 작성된 곳으로 프로그램의 실행 흐름을 바꾸어 준다.

            "이름:" 과 같이 콜론(:)이 붙어있는 부분을 이름표(label, 레이블)라고 한다.
            레이블은 특별한 선언 없이 사용할 수 있으며 언더바(_)나 영문자로 시작하면 된다.
            레이블은 한 단어처럼 공백없이 모두 붙여 써야 한다.

            switch( ) ... case ... : ... break; 에서
            case ... : 도 일종의 레이블이라고 생각할 수 있다.

            goto 레이블:
            명령을 사용하면 반복되는 부분을 여러 개 자유롭게 만들 수 있다.

            goto 명령은 반복 실행을 만들어낼 수 있는 가장 간단한 명령이지만,
            복잡하게(스파게티 코드) 사용하는 경우, 이해가 어렵고 오류가 생기기 쉽다.


            예시
              int n;
            reload: //레이블은 콜론(:)으로 끝내고, 일반적으로 들여쓰기를 하지 않는다.
              scanf("%d", &n);
              printf("%d", n);
              if(n!=0) goto reload; //reload라고 적혀있는 레이블로 실행 이동


         */
        Scanner sc = new Scanner(System.in);


        while(true) {
            int a = sc.nextInt();

            if( a == 0 ) {
                break;
            } else {
                System.out.println(a);
            }
        }

    }
}