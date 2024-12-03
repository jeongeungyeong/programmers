class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()){
            // 공백처리
            if (c == ' '){
                answer.append(c);
                continue;
            }
            
            // 대문자 범위
            if(Character.isUpperCase(c)){
                answer.append((char) ('A' + (c - 'A' + n) % 26));
            }
            else if (Character.isLowerCase(c)){
                answer.append((char) ('a' + (c- 'a' +n) % 26));
            }
        }
        
        return answer.toString();
    }
}