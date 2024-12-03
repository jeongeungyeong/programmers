import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        // 문자 위치 저장
        Map<Character, Integer> lastSeen = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            // 이전에 나타난 문자인가
            if(lastSeen.containsKey(c)){
                result[i] = i - lastSeen.get(c); // 첫 등장했던 문자 인덱스 빼기
            }
            else {
                // 첫 등장인 경우
                result[i] = -1;
            }
            lastSeen.put(c,i);
        }
        return result;
    }
}