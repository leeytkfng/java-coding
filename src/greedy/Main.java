package greedy;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        System.out.println("값을 입력하시오:");
        String ch = br.readLine();

        if(ch.equals("a")){
            bw.write("apple");
        } else if (ch.equals("b")){
            bw.write("banana");
        } else {
            bw.write("coconut");
        }
        bw.flush();


        char ch1 = ch.charAt(0);

        switch(ch1 -96) {
            case 1:
                System.out.println("apple");
                break;
            case 2:
                System.out.println("banana");
                break;
            case 3:
                System.out.println("coconut");
                break;
            default:
                System.out.println("null");
        }

        for (int i = 0 ; i <3 ;i++){
             System.out.print("JAVA"+(i+1)+"\t");
        }
        System.out.println();
        int j = 0;
        while (true) {
            if(j>2) {
                break;
            }
            System.out.print("JAVA"+(j+1)+"\t");
            j++;
        }
        System.out.println();
        int l = 0;
        do {
            System.out.print("JAVA"+(l+1)+"\t");
            l++;
        }while (l<3);
        System.out.println();

        while (true){
            for (int k = 0; k<4; k++){
                for (int t =0; t<4; t++){
                    System.out.print((t+1)+"\t");
                }
                System.out.println();
            }

            System.out.println("입력숫자:");
            int in = sc.nextInt();

            if(in ==0){
                System.out.println("끝");
                break;
            }

        }


        br.close();
        bw.close();
    }
}
