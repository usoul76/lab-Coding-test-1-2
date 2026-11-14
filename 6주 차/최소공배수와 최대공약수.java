class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(n, m);
        int lcm = (n * m) / gcd;
        
        return new int[]{gcd, lcm};
    }
    private int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}
//문제링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12940
