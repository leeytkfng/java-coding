package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class DfsBfs {

    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    static Scanner sc = new Scanner(System.in);

    public static void dfs(int node) {
        visited[node] = true;  //현재 방문한 노드 = ture , 방문 처리
        System.out.print(node + " "); //현재 노드 출력

        for(int neighbor : graph.get(node)){ //현재 노드와 연결된 노드들을 하나씩 확인
            if(!visited[neighbor]){ // 방문하지 않은 노드라면 재귀 호출
                dfs(neighbor); // 다시한번 탐색
            }
        }
    }
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visitedBFS = new boolean[graph.size()]; // BFS 전용 방문 체크 배열

        queue.add(start); // 시작노드를 큐에 삽입
        visitedBFS[start] = true; //start 지점부터 시작 , 시작 노드 방문 처리

        while (!queue.isEmpty()) { // 큐가 빌때까지 반복
            int node = queue.poll(); // 큐에서 쌓인 노드들 중에서 하나 꺼내기
            System.out.print(node + " "); // 현재 노드 출력

            for(int neighbor : graph.get(node)){
                if(!visitedBFS[neighbor]){ //bfs 탐색으로 방문한적 없는 노드
                    queue.add(neighbor); // 큐에 추가
                    visitedBFS[neighbor] = true; //방문처리
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
            Collections.sort(graph.get(i)); //어레이리스트에 무작위로 저장된 간선과 노드들의 관께를 오름차순으로 정렬
        }


        visited = new boolean[n + 1];
        dfs(v); //v번쨰에서 시작하기
        System.out.println();
        bfs(v);
    }
}