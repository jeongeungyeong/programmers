import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 
        int N = Integer.parseInt(br.readLine()); // N 입력

        int[] nNums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nNums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nNums); // 이분 탐색을 위한 정렬

        int M = Integer.parseInt(br.readLine()); // M 입력
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(nNums, target)).append("\n");
        }

        System.out.print(sb.toString());
    }

    // 이분 탐색 함수
    public static int binarySearch(int[] arr, int target) {
        int left = 0; // 가장 왼쪽 인덱스
        int right = arr.length - 1; // 가장 오른쪽 인덱스

        while (left <= right) {
            int mid = (left + right) / 2; // 중간 인덱스

            if (arr[mid] == target) {
                return 1; // 존재하면 1 반환
            } else if (arr[mid] < target) {
                left = mid + 1; // 중간 인덱스 오른쪽 탐색
            } else {
                right = mid - 1; // 중간 인덱스 왼쪽 탐색
            }
        }
        return 0; // 존재하지 않으면 0 반환
    }
}
