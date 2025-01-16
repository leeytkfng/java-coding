package greedy;

import java.util.Scanner;

public class LaundryOwner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dallor = {25,10,5,1};
        int[] s = new int[n];

        for(int i =0 ; i<n;i++){
            s[i] = sc.nextInt();
        }
        int [] answer = new int[4];
        for (int i = 0; i< n; i++){
            for(int j = 0; j < dallor.length ;j++){
                answer[j] = s[i] / dallor[j];
                s[i] %= dallor[j];
                System.out.print(answer[j] + "\t");
            }
            System.out.println();
        }
    }
}
