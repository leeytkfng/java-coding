package greedy;

import java.io.*;
import java.util.Scanner;

class Method{

    public void hi1(){
        System.out.println("hi");
    }
    public void hi2(String name){
        System.out.println("hi"+name);
    }
    public void hi3(String name){
        System.out.println("Good Morning ~!"+ name);
    }

}
class OutPut {
    String out ;

    public OutPut(String out){
        this.out= out;
    }
    public OutPut(){
        out = "lee1";
    }
}

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("10,20,30중에 입력하세요");
        int n = sc.nextInt();
        Method method = new Method();

        if (n == 10) {
            System.out.println(n*10);
        } else if (n == 20) {
            System.out.println(n*10);
        } else if (n == 30){
            System.out.println(n*10);
        }

        switch(n) {
            case 10 -> System.out.println(n * 10);
            case 20 -> System.out.println(n * 10);
            case 30 -> System.out.println(n * 10);
            default -> System.out.println("다시입력해라");
        }
        for(int i =1; i <4;i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        int j =0;
        while (j<3){
            j++;
            System.out.print(j+"\t");
        }
        System.out.println();
        int t = 0;
        do {
            t++;
            System.out.print(t+"\t");

        } while (t<3);
        System.out.println();

        int[] arr1 = {10,20,30};
        for(int s =0; s<arr1.length;s++){
            System.out.print(arr1[s]+" ");
        }
        System.out.println();

        int[][] arr = new int[2][3];
        int data =1;
          for(int i =0; i<arr.length;i++){
              for (int k= 0; k<3; k++){
                  arr[i][k] = data++;
                  System.out.print(arr[i][k]+"\t");
              }
              System.out.println();
          }
         method.hi1();
         method.hi2("sally");
         method.hi3("alpha");

         OutPut outPut = new OutPut("lee1");
         System.out.println(outPut);
         OutPut outPut1 = new OutPut();
         System.out.println(outPut1);
         OutPut outPut2 = new OutPut();
         System.out.println(outPut2.out);
    }
}
