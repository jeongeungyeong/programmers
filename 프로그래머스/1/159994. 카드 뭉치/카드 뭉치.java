class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int pointer1 = 0; //cards1의 포인터
        int pointer2 = 0; //cards2의 포인터
        
        
        for(String word : goal){
            //cards1에서 단어를 사용할 수 있는 경우, goal과 일치여부
            if(pointer1 < cards1.length && cards1[pointer1].equals(word)){
                pointer1++;
            }
            //cards2에서 단어를 사용할 수 있는 경우, goal과 일치여부
            else if(pointer2 < cards2.length && cards2[pointer2].equals(word)){
                pointer2++;
            }
            // 둘 다 아닌 경우
            else {
                return answer = "No";
            }
        }
        
         return answer = "Yes";
    }
}