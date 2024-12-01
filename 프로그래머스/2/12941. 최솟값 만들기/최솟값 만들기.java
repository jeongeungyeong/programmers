import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // 배열의 길이
        int length = A.length;
        
        // 배열 A,B 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        // A[i] * B[length-i] = 최소
        for(int i =0; i<length; i++){
            answer += A[i] * B[length-1-i];
        }
      

        return answer;
    }
}