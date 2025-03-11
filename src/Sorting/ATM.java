package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0 ;i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int prev = 0;
        int sum = 0;

        for (int i =0 ; i<N;i++){

            sum += arr[i] + prev;

            prev += arr[i];

        }

        System.out.println(sum);
    }
}