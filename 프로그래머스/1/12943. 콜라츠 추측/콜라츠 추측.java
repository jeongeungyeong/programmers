class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        // num이 1이 아니고, answer가 500 이하일 때
        while (n != 1){
            if(answer >= 500){
                return -1;
            }
            if (n % 2 == 0){
                n = n/2;
            }
            else {
                n = n * 3 +1;
            }
            
            answer++;
        }
        
        return answer;
    }
}