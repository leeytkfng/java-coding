package implement;

import java.util.Scanner;

public class factorial_ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int top = factorial(n);
        int bottom = factorial(m) * factorial(n - m);

        System.out.println(top / bottom);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1); // 5 * 4 = 20
    }
}
// 간단 구현 버전

//2. 직접 로직구현