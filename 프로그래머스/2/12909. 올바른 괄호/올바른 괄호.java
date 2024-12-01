import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        // 문자열 배열 변환
        char[] charArray = s.toCharArray();
        
        // 열린 괄호면 스택에 넣기
        for(char c : charArray){
            if(c == '('){
                stack.push(c);
            }
            else if (c == ')') {
                // 스택이 빈 상태라면
                if (stack.isEmpty()){
                    return false;
                }
                // 괄호 완성 스택에서 제거
                stack.pop();
            }
        }
        
        // 스택이 빈 상태면 true
        return stack.isEmpty();
    }
}