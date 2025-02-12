package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class DfsBfs {

    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    static Scanner sc = new Scanner(System.in);

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
    }
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visitedBFS = new boolean[graph.size()];

        queue.add(start);
        visitedBFS[start] = true; //start 지점부터 시작

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for(int neighbor : graph.get(node)){
                if(!visitedBFS[neighbor]){ //bfs 탐색으로 방문한적 없는 노드
                    queue.add(neighbor);
                    visitedBFS[neighbor] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt(); //노드 개수
        int m = sc.nextInt(); // 간선 개수
        int v = sc.nextInt(); // 시작 지점


        //그래프 초기화
        for(int i =0 ; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i =0; i<m;i++) {
            int u = sc.nextInt(); // u와 x 노드 서로 연결;
            int x = sc.nextInt();
            graph.get(u).add(x);
            graph.get(x).add(u);
        } //간선연결

        for(int i =1; i<=n; i++){
            Collections.sort(graph.get(i));
        }


        visited = new boolean[n + 1];
        dfs(v); //v번쨰에서 시작하기
        System.out.println();
        bfs(v);

    }
}