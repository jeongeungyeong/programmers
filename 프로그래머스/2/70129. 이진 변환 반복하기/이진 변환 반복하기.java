class Solution {
    public int[] solution(String s) {
        // 이진 변환 횟수
        int convertCount = 0;
        // 제거된 0의 갯수
        int removeZeroCount = 0;
        
        // s가 1이 될 때까지
        while(!s.equals("1")){
            // 원래 길이
            int originLength = s.length();
            // 0 제거하기
            s = s.replace("0","");
            // 제거된 새로운 길이
            int newLength = s.length();
            
            // 제거된 0의 갯수
            removeZeroCount += (originLength - newLength);
            
            // 새로운 s 이진법으로 전환
            s = Integer.toBinaryString(newLength);
            // 전환 횟수 증가
            convertCount++;
        }
        
        return new int[]{convertCount, removeZeroCount};
    }
}