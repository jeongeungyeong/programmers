class Solution {
    boolean solution(String s) {
        // 모두 소문자 변경
        String lower = s.toLowerCase();
        // p, y 카운트
        int pCount = 0;
        int yCount = 0;
        
        for(char c : lower.toCharArray()){
            if(c == 'p'){
                pCount ++;
            }
            else if (c == 'y'){
                yCount ++;
            }
        } 
        
       return pCount == yCount;

    }
}