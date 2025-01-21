import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> numberStack = new Stack<>();
        int len = number.length();
        
        for(int i = 0; i < len; i++){
            char current = number.charAt(i);
            // 스택이 비어있지 않고, 스택의 맨 위 숫자가 지금 숫자보다 작고, 제거 기회가 남았다면
            while(!numberStack.isEmpty() && numberStack.peek() < current && k > 0){
                numberStack.pop();
                k--;
            }
            numberStack.push(current);
        }
        
        // 제거 기회가 남았다면
        while (k > 0){
            numberStack.pop();
            k--;
        }
        
        // 정답 문자열
        StringBuilder answer = new StringBuilder();
        for(char c : numberStack){
            answer.append(c);
        }
        
      
        return answer.toString();
    }
}