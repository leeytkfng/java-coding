import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();

        int count = 0;
        int copy = a;
        while (true) {
            a = ((a % 10) * 10 + ((a / 10 + a % 10)%10));
            count++;
            if (a == copy) {
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }

}