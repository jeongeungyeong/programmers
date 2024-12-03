import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        // 스택 선언
        Stack<Character> stack = new Stack<>();
        
        // 문자 비교
        for(char c : s.toCharArray()){
            // 스택이 비어져있지 않고, 최상단 값이 c와 같을 때
            if(!stack.isEmpty() && stack.peek() == c){
                // 짝지어 제거
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        
        // 스택이 비어져있으면 1 반환, 아니면 0 반환
        return stack.isEmpty() ? 1 : 0;
    }
}