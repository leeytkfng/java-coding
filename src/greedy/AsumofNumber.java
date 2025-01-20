package greedy;

import java.util.Scanner;

public class AsumofNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        long i = 0;
        int answer = 0;

        while (a >= i + 1) { // a가 다음 i보다 크거나 같을 때만 실행
            i++;             // 1, 2, 3, ...
            a -= i;          // a에서 i를 차감
            answer++;        // 사용된 숫자 카운트
        }

        System.out.println(answer);
    }
}
