class Solution {
    public String solution(String s) {
        int len = s.length();
        int center = len / 2;
        
        // 길이가 짝수일 때
        if (len % 2 == 0) {
            return s.substring(center - 1, center + 1);
        } 
        // 길이가 홀수일 때
        else {
            return s.substring(center, center + 1);
        }
    }
}
//링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12903
