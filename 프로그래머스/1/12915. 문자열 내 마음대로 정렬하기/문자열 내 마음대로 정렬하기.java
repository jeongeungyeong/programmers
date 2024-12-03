import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 정렬 기준 세우기
        Arrays.sort(strings, (s1, s2) -> {
            // n번째 문자열 비교
            if(s1.charAt(n) == s2.charAt(n)){
                // 동일한 경우 사전순으로 비교
                return s1.compareTo(s2);
            }
            // n번째 문자를 기준으로 정렬
            return Character.compare(s1.charAt(n), s2.charAt(n));
        });
        
        return strings;
    }
}