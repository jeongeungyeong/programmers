import java.util.Arrays;


class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int[] intNumbers = Arrays.stream(numbers)
                                 .mapToInt(Integer::parseInt)
                                 .toArray();
        
        int min = Arrays.stream(intNumbers).min().getAsInt();
        int max = Arrays.stream(intNumbers).max().getAsInt();
        
        return min + " " + max;
    }
}