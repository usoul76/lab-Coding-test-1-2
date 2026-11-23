class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        long pNum = Long.parseLong(p);

        for (int i = 0; i <= t.length() - pLen; i++) {
            String sub = t.substring(i, i + pLen);
            long subNum = Long.parseLong(sub);

            if (subNum <= pNum) {
                answer++;
            }
        }

        return answer;
    }
}
//문제링크 : https://school.programmers.co.kr/learn/courses/30/lessons/147355?language=java
