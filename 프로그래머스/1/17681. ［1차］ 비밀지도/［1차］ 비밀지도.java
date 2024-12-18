class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
            
        
        // 각 배열의 요소를 10진수에서 2진수로 바꾸기
        for(int i = 0; i<n; i++){
            // 각 배열의 요소를 2진수로 변환하고 OR 연산
            int combined = arr1[i] | arr2[i];
            
            // 2진수를 문자열로 변환하고 길이를 n에 맞추기
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(combined));
            
            // 2진수 문자열을 0은 공백, 1은 "#"형식으로 변환
            answer[i] = binaryString.replace('1','#').replace('0',' ');
        }
        
        
        return answer;
    }
}