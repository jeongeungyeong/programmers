class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int num = left; num <= right; num++){
            // 약수 개수 구하기
            int counts = countDiv(num);
            // 약수가 짝수인 경우
            if(counts % 2 == 0){
                answer += num;
            }
            else {
                answer -= num;
            }
        }
        
        return answer;
    }
    // 약수의 개수 세기
    private int countDiv (int a){
        // 약수의 개수
        int count = 0;
        // 제곱해서 계산하기
        for(int i = 1; i<=Math.sqrt(a); i++){
            // i가 약수인 경우
            if(a % i == 0){
                count++;
                // i와 a/i가 다른 경우
                if(i != a/i){
                    count++;
                }
            }
        }
        return count;
    } 
}