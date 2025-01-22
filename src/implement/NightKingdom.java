package implement;

import java.util.Scanner;

public class NightKingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputData = sc.nextLine(); //"a1"

        int row = inputData.charAt(1) - '0'; //행(가로) // 원리 a1의 2번째 1문자열을 가져와서 char '0'으로 빼면 아스키코드 연산.
        int column = inputData.charAt(0) - 'a' + 1; //열(세로) //같은원리로써 문자열을 char 'a'로 뺴서 아스키연산

        // a1 = 1행 1열로 변환 , d5 => 5행 4열로 변환.
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};  //말이 움직이는 경로를 x,y로 나누었음

        int answer = 0;
        for (int i = 0; i < 8; i++) { // 칸크기는고정
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];

            if (nextRow >= 1 && nextRow <= 8 && nextColumn <= 8 && nextColumn >= 1) { //체스판 크기로 조정해주기
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
