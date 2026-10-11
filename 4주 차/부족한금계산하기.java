class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0;

        for (int i = 1; i <= count; i++) {
            totalCost += (long) price * i;
        }
        if (money >= totalCost) {
            return 0;
        } else {
            return totalCost - money;
        }
    }
}
//문제링크 : https://school.programmers.co.kr/learn/courses/30/lessons/82612
