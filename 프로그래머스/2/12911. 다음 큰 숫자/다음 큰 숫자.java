class Solution {
    public int solution(int n) {
        // n의 2진수에서 1의 개수를 세기
        int count = Integer.bitCount(n);
        
        // n+1부터 시작해서 1의 개수가 같은 수 찾기
        while(true){
            n++;
            if(Integer.bitCount(n) == count){
                return n;
            }
        }
    }
}