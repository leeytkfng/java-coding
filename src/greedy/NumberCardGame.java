package greedy;

import java.util.Scanner;

public class NumberCardGame {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;

        for (int i = 0 ; i<n; i++){
            int min_value = 1001;  //갱신 벨류를 넣기
            for(int j = 0; j< m; j++){
                int x = sc.nextInt();
                min_value = Math.min(min_value,x); //작은 수 돌려서 찾기 Math 메서드
            }
            answer = Math.max(min_value,answer); // 작은수 중에서 큰수 갱식.
        }
        System.out.println(answer);
    }
}
