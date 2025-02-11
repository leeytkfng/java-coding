package greedy;

import java.util.Scanner;

public class ZeroOrOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int cnt = 1; // 첫 번째 문자는 무조건 포함되므로 1로 시작

        for (int i = 0; i < str.length() - 1; i++) { // `i + 1`을 참조하므로 `length() - 1`까지만 반복
            if (str.charAt(i) != str.charAt(i + 1)) {
                cnt++; // 다른 문자 등장하면 카운트 증가
            }
        }

        System.out.println(cnt);
    }
}