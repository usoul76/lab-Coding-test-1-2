import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(arr[0]);
        int last = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(last != arr[i]){
                queue.offer(arr[i]);
                last = arr[i];
            }
        }
        
        int answer[] = new int[queue.size()];
        int cnt = 0;
        while(!queue.isEmpty()){
            answer[cnt++] = queue.poll();
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        return answer;
    }
}
//문제링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12906
