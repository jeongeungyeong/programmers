import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
       // 정답 배열
        int[] result = new int[commands.length];
        
        // 인덱스 위치 찾기
        for(int index = 0; index < commands.length; index++){
            int i = commands[index][0]; // 시작 위치
            int j = commands[index][1]; // 끝 위치
            int k = commands[index][2]; // k 번째 수
            
            // 배열 자르기
            int[] cut = Arrays.copyOfRange(array, i-1, j);
            // 오름차순 정렬
            Arrays.sort(cut);
            // k번째 숫자 꺼내기
            result[index] = cut[k-1];
        }
        
        return result;
    }
}