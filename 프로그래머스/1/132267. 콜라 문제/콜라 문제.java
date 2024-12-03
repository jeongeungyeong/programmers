class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; // 받은 콜라병의 수
        
        while (n >= a){
            int exchange = n/a; // 교환 가능한 콜라 병 수
            int remaining = n % a; // 교환 후 남은 빈 병 수
            answer += exchange * b; // 받은 콜라 병 수 누적
            n = exchange * b + remaining;
        }
        
        return answer;
    }
}