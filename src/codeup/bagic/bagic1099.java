package codeup.bagic;

import java.util.Scanner;

public class bagic1099 {
    public static void main(String[] args) {
        /*
            영일이는 생명과학에 관심이 생겨 왕개미를 연구하고 있었다.

            왕개미를 유심히 살펴보던 중 특별히 성실해 보이는 개미가 있었는데,
            그 개미는 개미굴에서 나와 먹이까지 가장 빠른 길로 이동하는 것이었다.

            개미는 오른쪽으로 움직이다가 벽을 만나면 아래쪽으로 움직여 가장 빠른 길로 움직였다.
            (오른쪽에 길이 나타나면 다시 오른쪽으로 움직인다.)

            이에 호기심이 생긴 영일이는 그 개미를 미로 상자에 넣고 살펴보기 시작하였다.

            미로 상자에 넣은 개미는 먹이를 찾았거나, 더 이상 움직일 수 없을 때까지
            오른쪽 또는 아래쪽으로만 움직였다.

            미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
            먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.

            단, 맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 먹이를 찾은 경우에는
            더이상 이동하지 않고 그 곳에 머무른다고 가정한다.


            미로 상자의 테두리는 모두 벽으로 되어 있으며,
            개미집은 반드시 (2, 2)에 존재하기 때문에 개미는 (2, 2)에서 출발한다.



            10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.


            성실한 개미가 이동한 경로를 9로 표시해 출력한다.

         */

        Scanner sc = new Scanner(System.in);

        int[][] miro = new int[10][10];

        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                miro[i][j] = sc.nextInt();
            }
        }

        int x = 2;
        int y = 2;

        boolean move = true;
        if(miro[1][1] == 2) {
            move = false;
        }

        miro[1][1] = 9;

        while(move) {
            int nextY = miro[x-1][y-1+1];
            if(nextY == 2 ) {
                miro[x-1][y-1+1] = 9;
                move = false;
            } else if(nextY == 0 ) {
                miro[x-1][y-1+1] = 9;
                y++;
            } else if(nextY == 1 ) { //장애물
                int nextX = miro[x-1+1][y-1];
                if(nextX == 2) {
                    miro[x-1+1][y-1] = 9;
                    move = false;
                } else if(nextX == 0 ) {
                    miro[x-1+1][y-1] = 9;
                    x++;
                } else if(nextX == 1 ) {
                    move = false;
                }
            }
        }

        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                System.out.print(miro[i][j] + " ");
            }
            System.out.println();
        }
    }
}