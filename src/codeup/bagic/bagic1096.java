package codeup.bagic;

import java.util.Scanner;

public class bagic1096 {
    public static void main(String[] args) {
        /*
            기숙사 생활을 하는 학교에서 어떤 금요일(전원 귀가일)에는 모두 집으로 귀가를 한다.

            오랜만에 집에 간 영일이는 아버지와 함께 두던 매우 큰 오목에 대해서 생각해 보다가
            "바둑판에 돌을 올린 것을 프로그래밍 할 수 있을까?"하고 생각하였다.

            바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
            n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.


            참고
            가로번호, 세로번호를 사용할 수 있는 2차원 배열을 사용하면
            이러한 형태를 쉽게 기록하고 사용할 수 있다. 물론 더 확장한 n차원 배열도 만들 수 있다.

            예시
            int n, i, j, x, y;
            int a[20][20]={};
            scanf("%d", &n);
            for(i=1; i<=n; i++)
            {
              scanf("%d %d", &x, &y);
              a[x][y]=1;
            }
            for(i=1; i<=19; i++) //한 줄(위에서 아래로) 씩
            {
              for(j=1; j<=19; j++) //한 열(왼쪽에서 오른쪽으로) 씩
              {
                printf("%d ", a[i][j]); //값 출력
              }
              printf("\n"); //줄 바꾸기
            }



            바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
            둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
            n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.



            흰 돌이 올려진 바둑판의 상황을 출력한다.
            흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.



         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer[][] = new int [19][19];

        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            answer[x-1][y-1] = 1;
        }

        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++) {
                System.out.print(answer[i][j] + " ");
            }

            System.out.println();
        }

    }
}