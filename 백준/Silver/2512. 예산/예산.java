import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 지방 도시 개수
        
        int[] hopes = new int[N];
        int minHope = 0;
        int maxHope = -1; // 음수로 설정 뒤 최고 희망 금액 비교
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            hopes[i] = Integer.parseInt(st.nextToken());
            maxHope = Math.max(maxHope, hopes[i]); // 비교해서 최대금액 찾기
        }
        
        int M = Integer.parseInt(br.readLine()); // 총 예산
        
        // 이분 탐색 알고리즘
        
        while (minHope <= maxHope){
            int mid = (minHope + maxHope) / 2; // 현재 설정한 상한액(중간값)
            long budget = 0; // 상한액을 적용했을 때 필요한 총 예산
            
            for(int i = 0; i < N; i++){
                // 희망금액이 설정값보다 큰 경우 설정값만 예산 배정
                if(hopes[i] > mid) {
                    budget += mid;
                }
                else {
                    budget += hopes[i]; // 희망금액 그대로 배정
                }
            }
            
            // 예산이 M 이하인 경우 더 높은 상한액이 있나 찾기
            if (budget <= M){
                minHope = mid + 1;
            } else {
                maxHope = mid - 1;
            }
        }
        
        System.out.print(maxHope);
    } 
}