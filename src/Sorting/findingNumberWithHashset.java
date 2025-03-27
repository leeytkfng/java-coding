package Sorting;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class findingNumberWithHashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //기준 배열 크기
        Set<Integer> base = new HashSet<>();
        for(int i = 0; i< n;i++){
            base.add(sc.nextInt());
        }

        int m = sc.nextInt();
        for(int i =0; i< m;i++){
            int num = sc.nextInt();
            if(base.contains(num)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }
}