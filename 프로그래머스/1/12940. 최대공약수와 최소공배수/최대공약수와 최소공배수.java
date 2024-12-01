class Solution {
    public int[] solution(int n, int m) {
        // 최대공약수
        int gcd = getGCD(n,m);
        // 최소공배수
        int lcm = (n * m) / gcd;
        
        return new int[] {gcd, lcm};
    }
    
    // 최대공약수 구하기 함수
    private int getGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}