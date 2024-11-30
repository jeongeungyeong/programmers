class Solution {
    public boolean solution(String s) {
        // 문자열 길이
        int length = s.length();
        
        // 문자열이 4이거나 6인 경우
        if(length == 4 || length == 6){
            // 문자열에 문자가 있는지
            for(int i = 0; i<length; i++){
                if(!Character.isDigit(s.charAt(i))){
                    return false;
                }
            }
            // 모든 조건 만족(숫자만 포함)
            return true;
        }
        // 모든 조건 불만족
        return false;
    }
}