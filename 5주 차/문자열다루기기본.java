class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("[0-9]+");
        }
        return false;
    }
}
//문제링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12918
