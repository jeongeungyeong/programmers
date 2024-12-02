class Solution {
    public int solution(int n) {
        // 1. 10진법 3진법으로 바꾸기
        String base3 = Integer.toString(n,3);
        
        // 2. 3진법 문자열 뒤집기
        String reverseBase3 = new StringBuilder(base3).reverse().toString();
        
        // 3. 다시 10진법으로 바꾸기
        int result = Integer.parseInt(reverseBase3, 3);
        
        return result;
    }
}