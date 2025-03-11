package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i]  =sc.nextInt();
        }

        Arrays.sort(arr);

        int M  = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<M ; i++){
            if(BinarySearch(arr,sc.nextInt()) >= 0 ) { //찾을려고 하는 값이 있을경우
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }


    public static int BinarySearch (int[] arr ,int key ){ // arr: 정렬된 배열, key 값.

        int lo = 0; //탐색범위 왼쪽 끝값 인덱스
        int hi = arr.length  -1; //오른쪽 끝값 인덱

        while (lo <= hi){
            int mid = (lo + hi) /2 ; //중간 인덱스 구하기 (기준점)

            if(key < arr[mid]){
                hi = mid -1; //끝값 조정
            }
            //key 값이 중간값보다 작을경우
            else if( key > arr[mid]) {
                lo = mid + 1; //첫값 조정
            }
            //key 값이 중간값보다 클경우

            else  {
                return mid;
            }
            //key 값이 중간값하고 같을경우.


        }
        return -1; //없으면 음수값 반환.
    }

}