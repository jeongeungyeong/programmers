class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String stars = "*".repeat(length-4);
        String lastFour = phone_number.substring(length-4);
        
        return stars + lastFour;
    }
}