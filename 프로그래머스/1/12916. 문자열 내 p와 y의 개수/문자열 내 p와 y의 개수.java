import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        char[] charArray = s.toCharArray();
        // p와 y의 개수
        int count = 0;
        
        for(int i =0; i<charArray.length; i++){
            if(charArray[i] == 'p' || charArray[i] == 'P'){
                count++;
            }
            else if(charArray[i] == 'Y' || charArray[i] == 'y') {
                count--;
            }
        }
        
        return count == 0;
    }
}