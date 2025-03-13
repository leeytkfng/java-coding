package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountingSorting {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3,1};

        countingSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt(); //배열 안에서 최댓값 찾기

        int[] count = new int[max +1]; // 카운트 배열생성
        int[] output = new int[arr.length]; //정렬된 결과 저장

        //1. 값 등장 횟수 카운트
        for(int num: arr){
            count[num]++;
        }

        //2. 누적합 계산(이전 값 + 현재 값)
        for(int i =1; i<=max; i++){
            count[i]  += count[i -1];
        }

        //3. 정렬된 배열 생성(역순으로 진행하여 안정 정렬 유지)
        for(int i= arr.length -1 ; i >= 0; i--){ //감소시키면서?
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        //결과를 원본 배열에 복사
        System.arraycopy(output,0,arr,0,arr.length);
    }
}
