import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken()); // 배달해야 하는 N킬로그램
        int count = 0; // 최소 봉지 수
        
        while(N >= 0){
            if(N % 5 == 0) {
                // 5kg 봉지로 나누어 떨어지는 경우
                count += N / 5;
                System.out.println(count);
                return;
            }
            // 5kg로 나누어 떨어지지 않으면 3kg 한 개 사용하기
            N -= 3;
            count++; 
        }
        
        System.out.println(-1); // 정확하게 나눌 수 없는 경우  
    }
}