class Solution {
    public boolean solution(int x) {
        int originX = x;
        // 자릿수의 합
        int sum = 0;
        
        while (x > 0){
            sum += x % 10;
            x /= 10;
        }
        
        return originX%sum == 0 ? true : false;
    }
}