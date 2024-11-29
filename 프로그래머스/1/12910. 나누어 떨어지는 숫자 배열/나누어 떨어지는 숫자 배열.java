import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[0];
        
        // 나누어 떨어지는 경우
        for(int num : arr){
            if(num % divisor == 0){
                // 배열 크기 하나 늘리기
                answer = Arrays.copyOf(answer, answer.length +1 );
                // 숫자 배열에 추가하기
                answer[answer.length -1] = num;
            }
        }
        
        // 나누어 떨어지지 않는 경우
        if (answer.length == 0){
            return new int[]{-1};
        }
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}