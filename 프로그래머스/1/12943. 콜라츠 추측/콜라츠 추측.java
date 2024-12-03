class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num; // int 범위 밖 수
        
        while (n != 1) {
            // answer가 500을 넘기면 -1 반환
            if (answer >= 500){
                return -1;
            }
            // 짝수라면
            if(n % 2 == 0){
                n /= 2;
            }
            // 홀수라면
            else {
                n = n * 3 +1;
            }
             answer++;
        }
        
        return answer;
    }
}