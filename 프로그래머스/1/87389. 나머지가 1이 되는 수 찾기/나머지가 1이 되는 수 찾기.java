class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i<n; i++){
            if(n%i == 1){
                return answer = i;
            }
        }
        
        return answer = -1; // 정상적인 경우에는 도달하지 않음 
    }
}