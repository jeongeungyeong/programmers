import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int total = 0;
        int count = 0;
        Arrays.sort(d); // 오름차순 정렬
        
        
        for(int i : d){
            if(i + total <= budget){
                total += i;
                count ++;
            } else{
                break;
            }
        }
        
        return count;
    }
}