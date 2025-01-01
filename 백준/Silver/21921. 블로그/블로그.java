import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]); // 지난 일수
        int x = Integer.parseInt(firstLine[1]); // 기간 X일
        
        String[] visitorInput = br.readLine().split(" "); // 일별 방문자 수
        int[] visitors = new int[n]; // 일별 방문자 수 배열
        for (int i = 0; i < n; i++) {
            visitors[i] = Integer.parseInt(visitorInput[i]);
        }

        int maxVisit = 0; // 최대 방문자 수
        int count = 0; // 최대 방문자 수를 가진 기간의 수
        int sumVisit = 0; // 현재 기간 X일 동안의 방문자 수 합

        // 슬라이딩 윈도우 방식 (투 포인터 방식)
        int start = 0; // start 포인터
        for (int end = 0; end < n; end++) {
            // end 포인터를 하나씩 증가시키며 방문자 수 합을 구함
            sumVisit += visitors[end];
            
            // 기간 X일이 되면 start 포인터를 이동시키며 합을 갱신
            if (end - start + 1 == x) {
                // 최대값 갱신
                if (sumVisit > maxVisit) {
                    maxVisit = sumVisit;
                    count = 1; // 새로운 최대값 발견
                } else if (sumVisit == maxVisit) {
                    count++; // 같은 최대값 기간이 또 발견
                }

                // start 포인터를 하나 증가시키며 다음 구간으로 이동
                sumVisit -= visitors[start];
                start++;
            }
        }

        // 결과 출력
        if (maxVisit == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxVisit);
            System.out.println(count);
        }
    }
}
