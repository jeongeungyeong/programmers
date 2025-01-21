import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; // 체육 수업을 들을 수 있는 최대 학생 수
        
        // 학생들의 체육복 현황
        int[] clothes = new int[n+1];
        Arrays.fill(clothes, 1); // 모두 가지고 있다고 가정
        
        // 분실한 학생들
        for(int l : lost){
            clothes[l]--;
        }
        
        // 여벌이 있는 학생들
        for(int r : reserve){
            clothes[r]++;
        }
        
        // 가까운 번호의 학생이 빌려줄 수 있는지 확인하기
        for(int i = 1; i <= n; i++){
            // 체육복이 없는 경우
            if(clothes[i] == 0) {
             // 앞번호 친구가 빌려줄 수 있는지
                if(i > 1 && clothes[i-1] == 2){
                    clothes[i]++;
                    clothes[i-1]--;
                }
            // 뒷번호 친구가 빌려줄 수 있는지
                else if (i < n && clothes[i+1] == 2){
                    clothes[i]++;
                    clothes[i+1]--;
                }
            } 
        }
        
        // 체육복 빌린 후
        for(int i = 1; i <= n; i++){
            if(clothes[i] > 0) {
                answer++;
            }
        }
        
        return answer;
    }
}