class Solution {
    public int solution(int n) {
        final int MOD = 1234567;
        // 피보나치 수를 저장할 배열 생성
        int[] dp = new int[n + 1];
        
        // 초기값 설정
        dp[0] = 0;
        dp[1] = 1;
        
        // 2부터 n까지 피보나치 수 계산
        for(int i =2; i <= n; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % MOD;
        }
         
        return dp[n];
    }
}