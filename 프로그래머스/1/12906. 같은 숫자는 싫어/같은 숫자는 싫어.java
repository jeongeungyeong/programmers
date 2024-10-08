import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 첫 번째 추가
        if(arr.length > 0){
            list.add(arr[0]);
        }
        
        // 중복 검사 진행 및 추가
        for(int i =1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        
        // int 배열로 변환하기
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        

        return answer;
    }
}