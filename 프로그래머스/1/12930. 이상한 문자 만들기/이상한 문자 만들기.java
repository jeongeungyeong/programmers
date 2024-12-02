class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        // 단어 내 위치를 추적
        int index = 0;
        
        for(char c : s.toCharArray()){
            // 공백인 경우
            if (c == ' '){
                result.append(c);
                index = 0; // 단어가 끝났으니 인덱스 초기화
            }
            else {
                // 짝수인 경우
                if(index % 2 == 0){
                    result.append(Character.toUpperCase(c));
                } else{
                    result.append(Character.toLowerCase(c));
                }
                index++; // 단어 내 인덱스 위치 증가
            }
        }
        
        return result.toString();
    }
}