class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    // dfs 함수 생성
    private int dfs(int[] numbers, int target, int index, int currentSum) {
        // 모든 숫자를 탐색한 경우
        if (index == numbers.length) {
            // 현재 합이 target과 같으면 1을 반환
            return currentSum == target ? 1 : 0;
        }

        // 현재 숫자를 더하거나 빼는 두 가지 경우 탐색
        int add = dfs(numbers, target, index + 1, currentSum + numbers[index]);
        int subtract = dfs(numbers, target, index + 1, currentSum - numbers[index]);

        // 두 경우의 결과를 합산, 타켓에 도달할 수 있는 총 경우의 수
        return add + subtract;
    }
}