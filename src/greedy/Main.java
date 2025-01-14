package greedy;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
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
        while (true) {

            int j = 0;
            if(j > 4) {
                break;
            }
            System.out.println("JAVA"+(j+1)+"\t");
            j++;

        }

        br.close();
        bw.close();
    }
}
