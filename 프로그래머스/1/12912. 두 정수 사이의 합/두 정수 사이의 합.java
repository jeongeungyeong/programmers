class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        // 최소값
        long start = Math.min(a,b);
        // 최대값
        long end = Math.max(a,b);
        
        // 등차수열의 합 (개수*(최소+최대))/2
        return answer = (end-start+1) * (start+end) / 2;
    }
}