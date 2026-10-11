import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] list = s.toCharArray();
        Arrays.sort(list);
        return new StringBuilder(new String(list)).reverse().toString();
    }
}
//문제링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12917 
