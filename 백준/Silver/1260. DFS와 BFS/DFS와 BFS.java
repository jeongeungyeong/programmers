import java.io.*;
import java.util.*;

public class Main {

    static int N, M, V;  // N: 정점의 개수, M: 간선의 개수, V: 시작 정점
    static int[][] arr;  // 그래프의 인접 행렬
    static boolean[] check;  // 방문 여부를 체크하는 배열
    static StringBuilder sb = new StringBuilder();  // 출력 결과를 저장
    static Queue<Integer> q = new LinkedList<>();  // BFS용 큐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 값 처리
        N = Integer.parseInt(st.nextToken());  // 정점의 개수
        M = Integer.parseInt(st.nextToken());  // 간선의 개수
        V = Integer.parseInt(st.nextToken());  // 탐색을 시작할 정점

        arr = new int[N + 1][N + 1];  // 인접 행렬 초기화
        check = new boolean[N + 1];  // 방문 여부 배열 초기화

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;  // 양방향 간선
        }

        // DFS 수행
        dfs(V);
        sb.append("\n");

        // 방문 여부 배열 초기화 후 BFS 수행
        Arrays.fill(check, false);
        bfs(V);

        // 결과 출력
        System.out.println(sb.toString().trim());
    }

    // DFS 구현
    public static void dfs(int start) {
        check[start] = true;
        sb.append(start).append(" ");

        // 작은 번호부터 방문해야 하므로, 작은 번호부터 탐색
        for (int i = 1; i <= N; i++) {
            if (arr[start][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }

    // BFS 구현
    public static void bfs(int start) {
        q.add(start);
        check[start] = true;

        while (!q.isEmpty()) {
            int current = q.poll(); //최상단
            sb.append(current).append(" ");

            // 작은 번호부터 탐색
            for (int i = 1; i <= N; i++) {
                if (arr[current][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
