import java.util.Arrays;
import java.util.Collections;


class Solution {
    public long solution(long n) {
        // 문자열로 변환 후 자릿수로 배열 추출
        String[] digits = Long.toString(n).split("");
        
        // 내림차순 정렬
        Arrays.sort(digits, Collections.reverseOrder());
        
        // 문자열로 조합
        String sorted = String.join("",digits);
        
        // 문자열 숫자로 변환 후 반환
        return Long.parseLong(sorted);
        
    }
}