package greedy;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class toNumberIntoOne {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result =0;

        while(true){
          int target = (n/k) *k ;
          result += n-target;
          n = target;
          if(n<k) break;

          result += 1;
          n /=k;
        }
        result += (n-1);  // 마지막에 남은수 ex ) 2에서 1을 빼서 다시 더하기 1이됨.
        System.out.println(result);
    }

}
