import java.io.*;
import java.util.*;

public class Main {
    static int m, n; // 가로, 세로
    static int[][] graph; // 배추밭
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스
        
        while(t-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken()); // 가로
            n = Integer.parseInt(st.nextToken()); //세로
            int k = Integer.parseInt(st.nextToken()); // 배추가 심어져 있는 위치의 개수
            
            graph = new int[m][n]; // m,n으로 그래프 초기화
            
            // 배추가 심어진 곳
            while(k-- > 0){
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken()); // 가로
                int y = Integer.parseInt(st.nextToken()); // 세로
                
                graph[x][y] = 1; // 그래프에 배추 위치 표시
            }
            
            int result = 0; // 최소 배추흰지렁이 수
            
            for(int i = 0; i < graph.length; i++){
                for(int j = 0; j < graph[i].length; j++){
                    if(dfs(i,j)){
                        result++; // true를 반환하면 새로운 배추 덩어리 발견
                    }
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
    
    // 현재 위치에서 연결된 모든 배추를 탐색
    private static boolean dfs(int i, int j){
        // i,j 가 m, n보다 크고 0보다 작으면
        if (i >= m || j >= n || i < 0 || j < 0){
            return false; // 탐색할 수 없으므로 false 반환
        }
        
        // 배추가 심어진 곳이면
        if(graph[i][j] == 1){
            // 배추 심어진 곳 탐색 완료
            graph[i][j] = 0;
            //상하좌우 탐색
            dfs(i-1,j); // 상
            dfs(i+1,j); // 하 
            dfs(i,j-1); // 좌
            dfs(i,j+1); // 우
            
            return true; //현재 배추 탐색 완료
        } 
        return false; // 배추가 없거나 이미 방문한 경우
    }
}