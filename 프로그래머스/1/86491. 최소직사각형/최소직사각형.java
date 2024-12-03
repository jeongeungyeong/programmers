class Solution {
    public int solution(int[][] sizes) {
        // 가로 최댓값
        int maxWidth = 0;
        // 세로 최댓값
        int maxHeight = 0;
        
        // 세로가 가장 길게 회전하기
        for(int i = 0; i<sizes.length; i++){
            // 가로가 세로보다 길면 세로랑 바꾸기
            if(sizes[i][0] > sizes[i][1]){
                int temp = sizes[i][0]; // 가로값 임시 저장
                sizes[i][0] = sizes[i][1]; // 가로에 세로값
                sizes[i][1] = temp; // 세로에 가로값
            }
            // 최댓값 갱신하기
            maxWidth = Math.max(maxWidth, sizes[i][0]);
            maxHeight = Math.max(maxHeight, sizes[i][1]);
        }
        
        // 결과 반환
        return maxWidth * maxHeight;
    }
}