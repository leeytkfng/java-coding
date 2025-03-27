package Mathmetics;

import java.util.Scanner;

public class avgUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();  // 학생 수
            int[] scores = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
            }

            int avg = sum / n;

            int count = 0;
            for (int score : scores) {
                if (score > avg) {
                    count++;
                }
            }

            float percent = (float) count / n * 100;
            System.out.printf("%.3f%%\n", percent);
        }

        sc.close();
    }
}
