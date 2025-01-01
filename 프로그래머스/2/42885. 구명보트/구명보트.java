import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0; // 구명보트 개수의 최솟값
        int start = 0; // 가장 가벼운 사람
        int end = people.length - 1; // 가장 무거운 사람
        
        // 오름차순 정렬
        Arrays.sort(people);
     
        while (start <= end){
            // 두 사람을 한 보트에 태울 수 있다면
            if(people[start] + people[end] <= limit){
                start++; //가장 가벼운 사람을 태우기
            }
            // 가장 무거운 사람을 보트에 태움
            end--;
            answer++; // 보트 하나 사용
        }
        
        return answer;
    }
}