import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 연산의 개수 N
            
            // 우선순위 큐 선언, 내림차순 정렬
            PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < N; i++){
                int X = Integer.parseInt(br.readLine()); // 정수 x
                
                if(X == 0){
                    // 힙이 비어있으면 0 출력 아니면 최대힙에서 최댓값 출력하고 제거하기
                    sb.append(heap.size() == 0 ? 0 : heap.poll()).append('\n');
                } else {
                    // 최대 힙에 정수 x 추가
                    heap.add(X);
                }
            }
            
        System.out.println(sb.toString());
    }
}
