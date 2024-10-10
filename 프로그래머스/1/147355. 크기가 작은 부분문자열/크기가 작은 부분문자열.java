class Solution {
    public int solution(String t, String p) {
        int a = t.length();
        int b = p.length();
        long pValue = Long.parseLong(p);
        int count = 0;
        
        for(int i = 0; i<=a-b; i++){
            String subString = t.substring(i, i+b);
            if(Long.parseLong(subString) <= pValue) {
                count++;
            }
        }
        
        return count;
    }
}