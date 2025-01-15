import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> uniqueSums = new HashSet<>(); // 수열의 합 모음, 중복값 제거
        
        // 원형 수열을 만들기 위해 기존 수열을 2배 확장
        // 중복해서 하나씩 더 만들기 ex: {7,9,1,1,4,7,9,1,1,4}
        int[] elementsExtend = new int[2 * n];
        for(int i = 0; i<n; i++){
            elementsExtend[i] = elements[i];
            elementsExtend[i+n] = elements[i]; // 2번 반복
        }
        
        // 슬라이딩 윈도우
        // 수열의 길이 만큼 합
        for(int length = 1; length <= n; length++){
            int sum = 0; // 수열 길의 합
            
            // 초기 윈도우 합
            for (int j = 0; j<length; j++){
                sum += elementsExtend[j];
            }
            uniqueSums.add(sum);
            
            // 윈도우를 이동해서 다음 합 구하기
            for(int start = 1; start < n; start++){
                sum = sum - elementsExtend[start - 1] + elementsExtend[start + length -1];
                uniqueSums.add(sum);
            }
        }
        
        return uniqueSums.size();

    }
}