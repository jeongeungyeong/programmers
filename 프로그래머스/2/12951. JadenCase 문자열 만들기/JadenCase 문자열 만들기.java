class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        // 단어의 첫시작 판별하기
        boolean start = true;
        
        for(char c : s.toCharArray()){
            // c가 공백이라면
            if(c == ' '){
                answer.append(c);
                start = true;
            }
            // c가 첫시작이라면
            else if(start){
                answer.append(Character.toUpperCase(c));
                start = false;
            }
            else{
                answer.append(Character.toLowerCase(c));
            }
        }
        return answer.toString();
    }
}