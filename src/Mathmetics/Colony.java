package Mathmetics;

import java.util.Scanner;

public class Colony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //13
        int count = 1;
        int range = 2;

        if(N ==1) {
            System.out.println(count);
        } else {
            while (range <= N) {
                range = range + (6 * count); //계속해서 범위를 늘려나가기
                count++;
            }
            System.out.println(count); //3
        }
    }
}
