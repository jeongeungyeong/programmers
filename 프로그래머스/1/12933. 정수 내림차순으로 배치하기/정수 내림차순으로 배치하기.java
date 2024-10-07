import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] digits = Long.toString(n).toCharArray();
        
        // 문자 배열을 오름차순으로 정렬
        Arrays.sort(digits);
        
        // 문자 배열을 뒤집기
        for (int i = 0; i < digits.length / 2; i++) {
            char temp = digits[i];
            digits[i] = digits[digits.length - 1 - i];
            digits[digits.length - 1 - i] = temp;
        }
        
        // 정렬된 문자 배열을 long으로 변환
        return Long.parseLong(new String(digits));
    }
}