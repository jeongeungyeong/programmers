import java.util.*;
import java.io.*;

public class Main {
    static int n, k; // 수빈이와 동생 위치
    static int[] visited = new int[100001]; // 방문 여부와 이동 횟수를 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken()); // 수빈이 위치
        k = Integer.parseInt(st.nextToken()); // 동생 위치

        // 수빈이와 동생의 위치가 같다면
        if (n == k) {
            System.out.println(0); // 이동할 필요 없음
        } else {
            BFS(); // BFS 수행
        }
    }

    // BFS를 활용한 최소 시간 계산
    public static void BFS() {
        Queue<Integer> queue = new LinkedList<>(); // BFS에 사용할 큐
        queue.offer(n); // 수빈 시작 위치를 큐에 추가
        visited[n] = 1; // 수빈 시작 위치를 방문 배열에 기록 (이동 횟수를 1로 초기화)

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            int now = queue.poll(); // 현재 위치를 큐에서 꺼냄

            // 현재 위치에서 이동 가능한 세 가지 경우 탐색
            for (int i = 0; i < 3; i++) {
                int next = 0; // 다음 위치 초기화

                // 오른쪽 이동
                if (i == 0) {
                    next = now + 1;
                }
                // 왼쪽 이동
                else if (i == 1) {
                    next = now - 1;
                }
                // 순간이동
                else {
                    next = now * 2;
                }

                // 유효하지 않은 위치 무시
                if (next < 0 || next > 100000) continue;

                // 동생의 위치를 찾은 경우
                if (next == k) {
                    System.out.println(visited[now]);
                    return;
                }

                // 이미 방문한 위치는 무시
                if (visited[next] != 0) continue;

                // 다음 위치를 큐에 추가하고, 이동 횟수를 기록
                queue.offer(next);
                visited[next] = visited[now] + 1;
            }
        }
    }
}
