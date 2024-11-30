class Solution {
    public int solution(int left, int right) {
        // 사칙연산 값
        int answer = 0;
        
        // 함수 활용
        // left부터 right까지 약수 갯수 구하기
        // 짝수는 더하기, 홀수는 빼기 
        for(int num = left; num <= right; num++){
            int countsDiv = countDiv(num);
            // 짝수인 경우
            if(countsDiv % 2 == 0 ){
                answer += num;
            }
            else {
                answer -= num;
            }
        }
        
        return answer;
    }
    
    // 약수 개수 세는 함수
    private int countDiv (int num){
        // 약수의 개수
        int count = 0;
        //제곱까지 
        for(int i = 1; i<= Math.sqrt(num); i++){
            // i로 나누어 떨어지면 약수
            if(num % i ==0){
                count++;
                // i와 num/i가 서로 다르면 약수
                if(i != num/i){
                    count++;
                }
            }
        }
        // 약수의 개수 반환하기
        return count;
    }
}