class Solution {
    public int[] solution(long n) {
        // 숫자열 문자로 바꾸기
        String number = String.valueOf(n);
        // 배열 선언
        int[] result = new int[number.length()];
        
        // 거꾸로 정렬
        for(char c : number.toCharArray()){
            for(int i = 0; i<number.length(); i++){
                result[i] = number.charAt(number.length()-1-i) - '0';
            }
        }
     return result;
    }
}