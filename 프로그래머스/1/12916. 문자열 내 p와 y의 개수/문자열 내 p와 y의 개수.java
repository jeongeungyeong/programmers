class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        boolean answer = true;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                pCount++;
            }
            if (s.charAt(i) == 'y') {
                yCount++;
            }
        }
        
        if(pCount == 0 && yCount == 0){
            answer=true;
        } else if (pCount == yCount){
            answer=true;
        } else{
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}