class Solution {
    public boolean solution(int x) {
        // 자릿수의 합
        int sumOfDigits = 0;
        // 원래 숫자
        int originNum = x;
        
        while(x > 0){
            sumOfDigits += x%10;
            x = x/10;
        }
        
        return originNum % sumOfDigits == 0;
    }
}