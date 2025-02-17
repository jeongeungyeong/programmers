import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    static Integer dp[]; // i번째 계단까지 올라갔을때 얻을 수 있는 최대 점수
    static int arr[]; // 각 계단에 적힌 점수
    
    public static void main(String[] args) throws IOException{
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 계단의 개수
        
        dp = new Integer[N+1]; // N개의 계단을 저장한 DP 배열 선언
        arr = new int[N+1]; // 각 계단의 점수를 저장할 배열 선언
        
        // 계단 점수 입력받기
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 0, 1 초기화
        dp[0] = 0; // dp는 기본값이 null이라 0으로 초기화
        dp[1] = arr[1]; // 첫번째 계단을 오르면 비교대상이 없음
        
        if(N >= 2){
            // 두번째 계단까지의 최대 점수는 첫번째 계단 + 두번째 계단의 점수
            dp[2] = arr[1] + arr[2];
        }
        
        // N번째 계단까지의 최대 점수를 출력
        System.out.println(find(N));
    }
    
    // 재귀를 이용한 DP 방식
    // N번째 계단까지 최대 점수 계산, N은 무조건 밟기
    
    static int find(int N){
        // 아직 탐색하지 않은 N번째 계단일 경우
        if(dp[N] == null){
            // N번째 계단을 밟을 때의 최대 점수는 2가지 방법 중 더 큰 값으로
            // 1. (N-2) -> (N): 2칸씩 올라가기
            // 2. (N-3) -> (N-1) -> (N): 1칸씩 올라가기, 연속3번은 안 됨
            dp[N] = Math.max(find(N-2), find(N-3)+arr[N-1]) + arr[N];
        }
        
        return dp[N]; // N번째 계단까지의 최대 점수 반환
    }
}