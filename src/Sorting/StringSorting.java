package Sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String [][] arr = new String[N][2];

        for(int i =0; i< N;i++){
            st =new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        br.close();

        Arrays.sort(arr, (a,b) -> {
            int num1 = Integer.parseInt(a[0]);
            int num2 = Integer.parseInt(b[0]);
            if(num1 != num2) {
                return num1 - num2;
            }
            return 0;
        });

        for(int i =0; i<N; i++){
            bw.write(arr[i][0] + " " + arr[i][1] +"\n");
        }

        bw.flush();
        bw.close();
    }

}