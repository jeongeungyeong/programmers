import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 가로길이 a만큼 '*' 생성
        String row = "*".repeat(a);
        
        // 세로 길이 b만큼 출력
        for(int i =0; i<b ; i++){
            System.out.println(row);
        }
        
    }
}