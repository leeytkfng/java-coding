import com.sun.jdi.Value;

import java.io.*;

public class Main{
    public static int[][] arr;
    public static int N ; //행
    public static int M; // 열

    public static boolean dfs(int i, int j){
        if(i < 0 || N <= i || j <0 || M <=j) { //크기를 벗어나는경우
            return false;
        }

        if(arr[i][j] == 0){
            arr[i][j] =1;

            dfs(i,j+1);  //이친구의 차이점은 4방면을 다조사
            dfs(i+1,j);
            dfs(i-1,j);
            dfs(i,j-1); //재귀함수 호출방식으로 근처 노드들 탐색

            return true;
        }
      return false;


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count=0;

        System.out.println("얼음 틀 길이:" );
        N = Integer.parseInt(br.readLine());
        System.out.println("얼음 횡 길이:");
        M = Integer.parseInt(br.readLine());

        arr = new int[N][M];

        for(int i =0; i<N; i++){
           String[] text = br.readLine().split("");
           for(int j= 0; j<M; j++){
               arr[i][j] = Integer.parseInt(text[j]);
           }
        }

        for(int i= 0; i<N;i++){
            for(int j=0; j<M; j++){
                if(dfs(i,j)){
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}