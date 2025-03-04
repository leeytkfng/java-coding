package Sorting;

import java.util.Scanner;

public class SortingOfNumberScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< n; i++){  //0
            for(int j = i+1; j < n; j++){  //1
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }

        for(int var: arr){
            System.out.println(var);
        }


    }

    private static void swap(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp; //java에서는 swap이 없기때문에 수동교환;
    }
}