class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n,m);
        int lcm = (n*m)/gcd;
        
        return new int[] {gcd,lcm};
    }
    
    // 최대공약수 구하기
    private int getGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}