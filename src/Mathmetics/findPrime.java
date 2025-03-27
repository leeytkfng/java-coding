package Mathmetics;

import java.util.Scanner;

public class findPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];


        for(int i=0; i< N; i++){
            arr[i] =sc.nextInt();
        }

        int count = 0;

        for(int n : arr){
            if(isPrime(n)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if(n <2 ) return false; //1검즘

        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n % i ==0) return false;
        }
        return true;
    }
}