class Solution {
    public int solution(int[] number) {        
        return countTriples(number, 0, new int[3], 0);
    }
    
    // 3씩 잘라서 비교하기
    private int countTriples(int[] number, int start, int[] current, int index){
        if(index == 3){
            return (current[0] + current[1] + current[2] == 0 ) ? 1 : 0;
        }
        
        int count = 0;
        for(int i = start; i<number.length; i++){
            current[index] = number[i];
            count += countTriples(number, i+1, current, index+1);
        }
        return count;
    }
}