package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class aStragyBigNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt(); //8
        int K = sc.nextInt(); //3

        int[] arr = new int[N];

        for(int i =0;i<N;i++){
           arr[i] = sc.nextInt();  //24546
        }
        Arrays.sort(arr); // 정령  // 24456
        int Max = arr[N-1]; //제일 큰수
        int second = arr[N-2]; // 두번째로 큰수/

        int answer = 0;

        int pattern = M / (K+1); // 한묶음으로 칭함
        int resume =  M % (K+1);

        answer = pattern * (K*Max + second) + resume*Max;



        System.out.println(answer);


    }
}
