import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // 문자열로 변환
        String number = String.valueOf(n);
        
        // 문자 배열로 변화
        for(char digit : number.toCharArray()){
            answer += Character.getNumericValue(digit);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}