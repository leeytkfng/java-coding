package algorithm;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class EscapeToMaze {

    private static  int n , m; //x축 ,y축 기준
    public static int graph[][]; // 미로를 나타내는 2D 행렬
    public static int dx[] = { -1, 1, 0,0};
    public static int dy[] = {0,0, -1 ,1};
    public static Queue<Pair> queue = new LinkedList<>();

    public static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x =x ;
            this.y =y;
        }
    }

    public static int bfs(int x, int y) {
        queue.add(new Pair(x,y));

        while (!queue.isEmpty()){
            Pair pair = queue.poll();
            x= pair.x;
            y =pair.y;

            for(int i =0 ;i<4 ;i++){
                int next_x = x + dx[i];
                int next_y = y + dy[i];

                if(next_x < 0 || next_y <0 || next_y >= n || next_y >= m){
                    continue;
                }
                if (graph[next_x][next_y] == 1) { //간 노드가 1이라면
                    graph[next_x][next_y] = graph[x][y] + 1;
                    queue.add(new Pair(next_x,next_y));
                }
            }
        }
        return  graph[n-1][m-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); //스트링 토큰나이저로 공백기준 문자열 읽어라
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        for(int i =0; i<n ;i++){
            String str = br.readLine();
            for(int j = 0;j< m;j++){
                graph[i][j] = str.charAt(j) -'0';
            }
        }

        bw.write(String.valueOf(bfs(0,0)));

        br.close();
        bw.close();
    }
}