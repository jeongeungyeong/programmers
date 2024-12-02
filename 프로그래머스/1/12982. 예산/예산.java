import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 예산의 합
        int sum = 0;
        
        // 배열 d 오름차순 정렬
        Arrays.sort(d);
        
        // 순차적으로 더하기
        for(int amount : d){
            // 만일 합이 예산을 초과하면 멈추기
            if(sum+amount > budget){
                break;
            }
            sum += amount;
            answer++; // 부서 횟수 증가
        }
        
        return answer;
    }
}