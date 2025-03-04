package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortingNumberFast {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  =Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i= 0; i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr); //**0(N logN) 정렬사용

        StringBuilder ab = new StringBuilder();

        for(int val : arr) {
            ab.append(val).append("\n");
        }
        System.out.println(ab);
    }
}