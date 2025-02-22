import java.util.PriorityQueue;


class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0; // 섞은 횟수
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        // 스코빌 배열 우선순위 큐에 담기
        for(int i = 0; i < scoville.length; i++){
            queue.add(scoville[i]);
        }
        
        // 가진 음식의 스코빌 지수가 K이상이 될 때까지 반복
        while (queue.peek() < K) {
            // 음식이 하나뿐이면 섞을 수 없으니 -1 반환
            if(queue.size() == 1) {
                return -1;
            }
            // 음식 섞기
            queue.add(queue.poll() + (queue.poll() *2));
            answer++; // 섞은 횟수 증가
        }      
        return answer;
    }
}