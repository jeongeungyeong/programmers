import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 우선순위 큐 최소힙
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐 최대 힙
        
        // 배열 A를 최소힙에 다 넣음
        for(int num : A){
            minHeap.offer(num);
        }
        
        // 배열 B를 최대힙에 다 넣음
        for (int num : B){
            maxHeap.offer(num);
        }
        
        int answer = 0;
        
        while(!minHeap.isEmpty()){
            answer += minHeap.poll() * maxHeap.poll();
        }
        
        System.out.print(answer);
        return answer;
    }
}