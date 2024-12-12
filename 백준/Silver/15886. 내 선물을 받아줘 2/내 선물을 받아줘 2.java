import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 골목길의 길이와 이동패턴 입력 받기
        int N = sc.nextInt(); 
        String map = sc.next();
        
        // 선물 개수 초기화
        int gifts = 0; 
        // 이동 패턴을 문자열로 변환 
        char[] mapArray = map.toCharArray();
        
        // 'E'와 'W'가 연속으로 있는 구간에서 무조건 선물을 받음
        for(int i = 0; i < N-1 ; i++){
            if(mapArray[i] == 'E' && mapArray[i+1] == 'W'){
                gifts++;
            }
        }
        
        // 결과 출력
        System.out.println(gifts);
    }
}
