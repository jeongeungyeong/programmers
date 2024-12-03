class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            answer = getLcm(answer, arr[i]);
        }
        return answer;
    }
    
    // 최대공약수 구하기
    private int getGCD(int a, int b){
        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    
    // 최소공배수 구하기
    private int getLcm(int a, int b){
        return (a * b) / getGCD(a, b);
    }
    
}