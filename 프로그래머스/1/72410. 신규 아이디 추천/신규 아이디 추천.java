import java.util.regex.*;

class Solution {
    public String solution(String new_id) {
        // 1단계: 모두 소문자로 변경
        new_id = new_id.toLowerCase();
        
        // 2단계: 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 문자 모두 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계: 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
        // 최소 몇 개 이상: "{Min,}"
        // 특수문자 표현 \.
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 4단계: 마침표가 처음이나 끝에 위치한다면 제거
        // ^(시작 의미), $(끝 의미)
        new_id = new_id.replaceAll("^\\.|\\.$","");
        
        // 5단계: 빈 문자열이라면 'a' 대입
        if(new_id.isEmpty()){
            new_id = "a";
        }
        
        // 6단계: 길이가 16자리 이상이라면 첫 15자리를 제외한 나머지 모두 제거
        // 만일 마침표가 마지막에 위치하면 제거
        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15).replaceAll("\\.$", "");
        }
        
        // 7단계: 2자리 이하라면 마지막 문자를 new_id 길이가 3이 될 때까지 반복해서 붙이기
        while(new_id.length() < 3){
            new_id += new_id.charAt(new_id.length() - 1);
        }
            
        return new_id;
    }
}