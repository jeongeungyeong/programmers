import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int n = score.length;
        int[] answer = new int[n];
        
        // 우선순위 큐 생성
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < n; i++){
            // 현재 점수를 우선순위 큐에 삽입
            minHeap.add(score[i]);
            
            // 명예의 전당에 들어갈 점수가 k개를 넘지 않게
            if(minHeap.size() > k){
                // 가장 작은 값 제거
                minHeap.poll();
            }
            
            // 현재 명예의 전당에서 최하위 점수를 기록
            answer[i] = minHeap.peek(); // 힙의 최상단 값이 최하위 점수
        }
        
        return answer;
    }
}