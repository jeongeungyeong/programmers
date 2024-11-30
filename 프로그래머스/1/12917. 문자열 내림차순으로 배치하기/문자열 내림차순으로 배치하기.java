import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열 문자 배열로 변환
        char[] charArray = s.toCharArray();
        
        // 문자 배열 오름차순으로 정렬
        Arrays.sort(charArray);
        
        // 문자객체 생성
        // 문자배열 -> 문자열 변환
        StringBuilder sortedString = new StringBuilder(new String(charArray));
        // 문자 뒤집기
        sortedString.reverse();
        
        // 최종 문자열 반환
        return sortedString.toString();
    }
}