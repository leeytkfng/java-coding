package greedy;

import java.io.*;
import java.util.Scanner;

class Mehotd{
    public void hi(){
        System.out.println("hi");
    }
}

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("10,20,30중에 입력하세요");
        int n = sc.nextInt();
        Mehotd mehotd = new Mehotd();

        if (n == 10) {
            System.out.println(n*10);
        } else if (n == 20) {
            System.out.println(n*20);
        } else if (n == 30){
            System.out.println(n*30);
        }

        switch (n) {
            case 10: System.out.println(n*10); break;
            case 20:System.out.println(n*20); break;
            case 30: System.out.println(n*30);break;
            default:System.out.println("다시입력해라");
        }
        for(int i =0; i <2 ;i++){
            System.out.println(i);
        }
        int j =0;
        while (j<3){
            j++;
            System.out.println(j);
        }
        int t = 0;
        do {
            t++;
            System.out.println(t);

        } while (t<3);

        int[][] arr = new int[2][3];
        int data =1;
          for(int i =0; i<arr[i].length;i++){
              for (int k= 0; k<3; k++){
                  arr[i][k] = data++;
                  System.out.print(arr[i][k]+"\t");
              }
              System.out.println();
          }
         mehotd.hi();
    }
}
