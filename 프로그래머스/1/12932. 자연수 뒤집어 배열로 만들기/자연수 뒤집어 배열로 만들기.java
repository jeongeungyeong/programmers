class Solution {
    public int[] solution(long n) {
        // 문자열로 만들기
        String str = Long.toString(n);
        // 문자열의 길이
        int length = str.length();
        // 정답을 담을 배열
        int[] answer = new int[length];
        
        // 뒤에서부터 숫자 담기
        for(int i =0; i<length; i++){
            answer[length - 1 - i] = str.charAt(i) - '0';
        }
        
        return answer;
    }
}