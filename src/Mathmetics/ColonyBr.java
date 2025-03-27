package Mathmetics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ColonyBr {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;

        if(N ==1) {
            System.out.println(count);
        } else {
            while (range <= N) {
                range = range + (6 * count); //계속해서 범위를 늘려나가기
                count++;
            }
            System.out.println(count); //3
        }
    }
}
