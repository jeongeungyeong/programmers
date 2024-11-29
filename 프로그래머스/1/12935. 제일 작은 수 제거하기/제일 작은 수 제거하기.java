import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우
        // -1을 채워 리턴하기
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        // 배열에서 최솟값 찾기
        int min = Arrays.stream(arr).min().getAsInt();
        // 최솟값 제외 배열 반환하기
        return Arrays.stream(arr).filter(num -> num != min).toArray();
    }
}