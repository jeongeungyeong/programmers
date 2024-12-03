import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 중복 제거를 위해 set 사용
        Set<Integer> sums = new HashSet<>();
        
        // 두 개 뽑아서 더하기
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                sums.add(numbers[i] + numbers[j]);
            }
        }
        
        // set 배열로 변환
        int[] answer = sums.stream().mapToInt(Integer::intValue).toArray();
        // 배열 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}