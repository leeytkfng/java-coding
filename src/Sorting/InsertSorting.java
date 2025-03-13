package Sorting;

import java.util.Arrays;

public class InsertSorting {
    public static void main(String[] args) {

        int[] arr = {6,4,3,9,3,1,2};

        insertionSort(arr);
        selectionSort(arr);

        System.out.println("정렬된 배열: " +Arrays.toString(arr));
        System.out.println("선택 정렬:" +Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){ //두번째 원소부터 시작
            int key = arr[i]; //1번쨰 인덱스
            int j= i-1; //0번째 인덱스 0

            //key보다 큰값은 한칸씩 뒤로 이동;
            while (j >=0 && arr[j]> key){
                 arr[j+1] = arr[j];  //6 -> 4 , 4->6
                 j--;
            }

            arr[j +1] = key; //적절한 위치에 key 삽입 //4
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i= 0; i< n-1; i++){
            int minIndex = i; //최소값의 위치

            //최솟값 찾기
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = arr[i];
                arr[i]  = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

    }
}

