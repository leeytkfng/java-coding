package Sorting;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,9,10};
        int[] arr1 = {6, 4, 3, 9, 3, 1, 2};

        int target = 7;

        int result = binarySearch(arr,target,0,arr.length-1);

        quickSort(arr1,0,arr1.length-1); // 배열 ,왼쪽값 , 맨오른쪽 값
        System.out.println("퀵 정렬결과:" + Arrays.toString(arr1));
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target, int left ,int right){
        if(left >right) return -1; //종료 조건

        int mid = left +(right - left) /2 ;

        if (arr[mid] == target) return mid; //값 찾음
        else if(arr[mid] > target) return binarySearch(arr,target,left,mid-1); //기준값보다 작으면 오른쪽 값을 조정
        else return binarySearch(arr, target,mid+1,right); //dhfmsWhr xkator 오른쪽 피버 기준

    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left <right) {
            int pivotIndex = partition(arr, left ,right);
            quickSort(arr, left ,pivotIndex -1);
            quickSort(arr, pivotIndex +1, right);
        }
    }

    public static int partition(int[] arr, int left ,int right) {
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left; j<right;j++) {
            if (arr[j] < pivot){ //피벗보다 작은값을 왼쪽으로
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr ,i +1 ,right);
        return i +1;
    }

    public static void swap(int[] arr ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
