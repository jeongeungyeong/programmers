import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //첫 번째 줄 입력
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]); // 전체 날짜의 수
        int K = Integer.parseInt(firstLine[1]); // 합을 구하기 위한 연속적인 날짜의 수
        
        //두 번째 줄 입력
        String[] secondLine = br.readLine().split(" ");
        int[] temperatures = new int[N];
        for(int i = 0; i < N; i++){
            temperatures[i] = Integer.parseInt(secondLine[i]);
        }
        
        int maxTemper = 0; // 최대 온도
        int sumTemper = 0; // 현재 온도 합

        for(int i = 0; i < N-K+1; i++){
            // 디폴트값 구하기
            if(i == 0){
                // x일
                for(int j = 0; j < K; j++){
                  sumTemper += temperatures[j];  
                }
                maxTemper = sumTemper;
            }
            else{
                // 윈도우를 오른쪽으로 한 칸 옮기기
                // 현재 온도 합에서 첫 번째 값 제거, 다음 오른쪽 합 추가
                sumTemper = sumTemper - temperatures[i-1] + temperatures[i+K-1];
                
                // 만일 현재 온도 합이 최대 값보다 크다면
                if (sumTemper > maxTemper){
                    maxTemper = sumTemper;
                }
            }
        }
        
        System.out.print(maxTemper);
    }
}