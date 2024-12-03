class Solution {
    public int solution(int[] number) {
        // 삼총사 개수 
        int answer = 0;
        
        // 3개의 숫자를 선택하는 모든 조합
        for(int i = 0; i <number.length; i++){
            for (int j = i +1; j < number.length; j++){
                for (int k = j+1; k < number.length; k++){
                    // 세 숫자의 합이 0이면 삼총사
                    if (number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}