class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        long sumCount = (long) (count * (1+count))/2;
        
        // 등비수열의 합
        totalPrice = (long) price * (sumCount);
        
        long result = totalPrice - money;
       
        return result > 0 ? result : 0;
    }
}