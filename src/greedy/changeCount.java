package greedy;

import java.util.Scanner;

public class changeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("돈을 입력:");
        int n = sc.nextInt();
        int count = 0;
        int[] coin_type = {500,100,50,10};
        for(int i = 0; i< coin_type.length; i++){
            int coin = coin_type[i];
            count += n / coin; //1.500 2. 100 3.50 .4.10
            n %= coin; //나머지로 남은값 반환
        }
        System.out.println(count);
    }
}

// 알고리즘 구현 과정에서 생각할수있는것
/* 시간 복잡도를 최소화 하기 */
/* 공간 복잡도를 최소화 하기 */