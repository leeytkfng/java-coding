package implement;

import java.util.Scanner;

public class UpDownLeftRight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //버퍼 비우기
        int x = 1, y =1;
        String[] arr =sc.nextLine().split(""); //공백으로 띄어서 문자열 받기

        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};  //이렇게 2개로 설정하는이유는 x 축과 y축을 담담하는 영역들이 다르기 때문이다 .
        char[] location = {'L','R','U','D'};

        for (int i = 0; i <arr.length;i++) {
            char arr1 = arr[i].charAt(0); //arr 배열에서 원소 가지고오기
            int nx = -1 , ny = -1;
            for(int j =0; j<4; j++){
                if(arr1 == location[j]){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if(nx < 1 || ny < 1 ||nx > n || ny > n) continue;

            x = nx;
            y = ny;
        }
        System.out.println(x+" "+y);

    }
}
