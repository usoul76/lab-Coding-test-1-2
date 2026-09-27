class Solution {
    public int solution(int n) {
        String str = "";
        while (n != 0) {
            str += n % 3;
            n /= 3;
        }
        return Integer.parseInt(str, 3);
    }
}
//문제링크 : https://school.programmers.co.kr/learn/courses/30/lessons/68935
