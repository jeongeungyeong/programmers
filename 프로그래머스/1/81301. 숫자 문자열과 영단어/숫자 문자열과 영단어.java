import java.util.*;

class Solution {
    public int solution(String s) {
        // 숫자와 영단어 대응
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");
        
        // 모든 영단어를 숫자로 치환하기
        for(String word : numberMap.keySet()){
            s = s.replace(word, numberMap.get(word));
        }
        
        // 치환된 문자열을 정수로 변환
        return Integer.parseInt(s);
    }
}