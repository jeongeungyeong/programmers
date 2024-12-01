import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 스택 선언
        Stack<Integer> stack = new Stack<>();
        
        // 스택을 활용해 중복값 제거
        for(int num : arr){
            // 스택이 비었거나, 스택의 최상단 값이 num과 다르면 삽입
            if(stack.isEmpty() || stack.peek() != num){
                stack.push(num);
            }
        }
        
        // 정답 배열 선언
        int[] answer = new int[stack.size()];
        // 스택의 값 뒤에서부터 배열에 담기
        for(int i = answer.length -1; i>= 0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}