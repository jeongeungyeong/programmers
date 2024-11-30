import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열 공백으로 분리
        String[] strArray = s.split(" ");
        // 숫자 배열로 변환
        int[] numbers = Arrays.stream(strArray)
                              .mapToInt(Integer::parseInt)
                              .toArray();
        // 최솟값
        int min = Arrays.stream(numbers).min().getAsInt();
        // 최댓값
        int max = Arrays.stream(numbers).max().getAsInt();
        
        // 최종 결과 문자열 반환
        return min + " " + max;
    }
}