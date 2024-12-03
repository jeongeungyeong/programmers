class Solution {
    public String solution(int[] food) {
        StringBuilder leftSide = new StringBuilder();
        
        // 왼쪽 배치 생성
        for(int i = 1; i<food.length; i++){
            // 음식의 숫자
            int count = food[i] / 2 ;
            // 음식 배열 (음식 칼로리(i)를 음식 숫자만큼 배열)
            leftSide.append(String.valueOf(i).repeat(count)); 
        }
        
        // 오른쪽 배치 생성
        String rightSide = leftSide.reverse().toString();
        // 왼쪽 다시 복구
        leftSide.reverse();
        
        // 최종 반환 + 물(0)
        return leftSide.toString() + "0" + rightSide;
    }
}