class Solution {
    public String solution(String s) {
       // 단어 길이
        int length = s.length();
        // 중간 인덱스
        int mid = length / 2;
        
        // 단어 길이가 홀수인 경우 가운데 값 하나 반환
        if(length % 2 == 1){
            return String.valueOf(s.charAt(mid));
        }
        // 단어 길이가 짝수인 경우 가운데 두 글자 반환
        else {
            return s.substring(mid -1 , mid +1);
        }
    }
}