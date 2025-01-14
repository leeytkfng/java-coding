package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class changeCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("돈을 입력 (1 ~ 999원 사이의 값을 입력하세요):");
        int n = 1000 - Integer.parseInt(br.readLine());

        if (n < 0 || n > 999) {
            System.out.println("유효하지 않은 입력입니다. 1 ~ 999원 사이의 값을 입력하세요.");
            return;
        }

        int count = 0;
        int[] coinType = {500, 100, 50, 10, 5, 1};

        for (int coin : coinType) {
            count += n / coin;  // 해당 동전으로 거슬러 줄 수 있는 개수
            n %= coin;          // 남은 금액 계산
        }

        System.out.println("필요한 동전 개수: " + count);
    }
}

// 알고리즘 구현 과정에서 생각할수있는것
/* 시간 복잡도를 최소화 하기 */
/* 공간 복잡도를 최소화 하기 */