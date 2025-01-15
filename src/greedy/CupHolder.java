package greedy;

import java.util.Scanner;

public class CupHolder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String seat = sc.nextLine();

        int result = 1; //컵 홀더 무조건 하나있음 S든 LL이든 컵홀더 1개시작

        for(int i =0; i<n ;i++){
            if(seat.charAt(i)=='S'){
                result += 1;
            } else if (seat.charAt(i)=='L'){
                result +=1;
                i++; // 다음번호가 L일거기 떄문에 건너뜀
            }
        }
        System.out.println(result);
    }

}
