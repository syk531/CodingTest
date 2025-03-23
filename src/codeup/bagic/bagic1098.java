package codeup.bagic;

import java.util.Scanner;

public class bagic1098 {
    public static void main(String[] args) {
        /*
            부모님과 함께 유원지에 놀러간 영일이는
            설탕과자(설탕을 녹여 물고기 등의 모양을 만든 것) 뽑기를 보게 되었다.

            길이가 다른 몇 개의 막대를 바둑판과 같은 격자판에 놓는데,

            막대에 있는 설탕과자 이름 아래에 있는 번호를 뽑으면 설탕과자를 가져가는 게임이었다.
            (잉어, 붕어, 용 등 여러 가지가 적혀있다.)



            첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
            두 번째 줄에 놓을 수 있는 막대의 개수(n)
            세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.

            입력값의 정의역은 다음과 같다.

            1 <= w, h <= 100
            1 <= n <= 10
            d = 0 or 1
            1 <= x <= 100-h
            1 <= y <= 100-w



         */

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int arr[][] = new int[h][w];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=0; j<l; j++) {
               if(d == 0) { //가로
                   arr[x-1][y-1+j] = 1;
               } else {
                   arr[x-1+j][y-1] = 1;
               }
            }
        }

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}