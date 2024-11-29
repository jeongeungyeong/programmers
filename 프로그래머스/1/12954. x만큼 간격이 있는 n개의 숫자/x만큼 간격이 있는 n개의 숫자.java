class Solution {
    public long[] solution(int x, int n) {
        // 배열 초기화
        long[] answer = new long[n];
        
        for(int i = 1; i < n+1 ; i++){
            answer[i-1] = (long) x * i;
        }
        return answer;
    }
}