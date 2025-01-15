import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫번째 줄 입력
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int x = Integer.parseInt(firstLine[1]);
        
        // 두번째 줄 입력
        String[] visitorInput = br.readLine().split(" ");
        int[] visitors = new int[n];
        for(int i = 0; i < n; i++){
            visitors[i] = Integer.parseInt(visitorInput[i]);
        }
        
        int maxVisit = 0; // 최대 방문자 수
        int count = 0; // 최대 방문자 수를 가진 기간의 수
        int sumVisit = 0; // 현재 기간 x일 동안의 방문자 수 합
        
        // 슬라이딩 윈도우 방식
        for(int i = 0; i < n-x+1; i++){
            // 첫번째 구간 합 계산
           if(i == 0){
               for(int j = 0; j < x; j++){
                   sumVisit += visitors[j];
               }
               maxVisit = sumVisit;
               count = 1;
           }
            else {
                // 윈도우를 오른쪽으로 한 칸 이동
                sumVisit = sumVisit - visitors[i-1] + visitors [i+x-1];
                
                if(sumVisit == maxVisit){
                    count++;
                }
                else if(sumVisit > maxVisit){
                    maxVisit = sumVisit;
                    count = 1;
                }
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