class Solution {
    public int solution(int n) {
        // 표현법
        int count = 0;
        // 연속된 숫자 개수
        int k = 1;
        
        while(k * (k-1) / 2 < n){
            if((n - k * (k-1)/2) % k == 0){
                count++;
            }
            k++;
        }
        
        return count;
    }
}