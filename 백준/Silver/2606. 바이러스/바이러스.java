import java.io.*;
import java.util.*;

public class Main{
    // 그래프를 저장할 인접 리스트
    static ArrayList<Integer>[] arr;
    // 컴퓨터의 수 = n
    static int n;
    // 감염된 컴퓨터 수
    static int result = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. 컴퓨터 수를 입력받기
        n = Integer.parseInt(br.readLine());
        // 2. 네트워크 연결 쌍 입력받기
        int m = Integer.parseInt(br.readLine());
        // 3. 인접 리스트 초기화
        arr = new ArrayList[n+1]; // 컴퓨터 번호는 1번부터 시작하기에 n+1로 설정
        for(int i = 0; i<=n; i++){
            arr[i] = new ArrayList<>();
        }
        // 4. 네트워크 연결 정보 입력받아 인접 리스트에 저장하기 (그래프 그리기)
        for (int j = 0; j < m; j++){
            // 띄어쓰기에 따라 구분해서 입력받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }
        // 5. BFS 실행: 1번 컴퓨터부터 감염 시작
        bfs(1);
        // 6. 감염된 컴퓨터의 수 (1번 제외; 1번과 연결된 모든 컴퓨터 수)
        System.out.println(result);
    }
    
    // BFS 구현하기
    public static void bfs(int start){
        // BFS를 위한 큐
        Queue<Integer> queue = new LinkedList<>();
        // 감염 여부를 저장하는 배열
        boolean[] virus = new boolean[n+1];
       // 시작 노드는 방문처리(이미 감염됨)
        virus[start] = true;
        // 시작 노드를 큐에 추가하기
        queue.add(start);
        
        while(!queue.isEmpty()){
            int now = queue.poll(); // 큐에서 노드 하나 꺼내기
            
            // 현재 노드에 연결된 모든 노드를 확인하기
            for(int x : arr[now]){
                // 아직 방문하지 않은 노드라면
                if(!virus[x]){
                    virus[x] = true; // 방문(감염) 처리
                    result++; // 감염 컴퓨터수 증가
                    queue.add(x); // 큐에 추가해서 연결된 다음 대상 설정
                }
            }
        }
    }
}