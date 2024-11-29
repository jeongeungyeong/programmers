class Solution {
    public String solution(String phone_number) {
        // 문자열 길이 구하기
        int length = phone_number.length();
        
        // 뒷자리 4개를 제외하고 '*'로 채우기
        String masked = "*".repeat(length - 4);
        
        // 뒷자리 4개 숫자 가져오기
        String last4Digits = phone_number.substring(length-4);
        
        // 최종 결과 반환
        return masked + last4Digits;
    }
}