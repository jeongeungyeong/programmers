class Solution {
    public int solution(String t, String p) {
        // p의 길이
        int pLength = p.length();
        // p의 정수값
        long pValue = Long.parseLong(p);
        // p보다 작거나 같은 값의 갯수
        int count = 0;
        
        // 부분 문자열 탐색
        for(int i = 0; i <= t.length() - pLength; i++){
            String subString = t.substring(i, i+pLength);
            // 부분 문자열 정수로 변환
            long subValue = Long.parseLong(subString);
            // 값 비교
            if (subValue <= pValue){
                count++;
            }
        }
        
        return count;
    }
}