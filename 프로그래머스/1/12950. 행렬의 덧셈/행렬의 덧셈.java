class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 길이
        int rows = arr1.length; // 행의 길이
        int cols = arr1[0].length; // 열의 길이
        // 결과를 저장할 행렬
        int[][] result = new int[rows][cols];
        
        // 행렬 더하기
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return result;
    }
}