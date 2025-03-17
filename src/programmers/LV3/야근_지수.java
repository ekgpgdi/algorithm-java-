package programmers.LV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class 야근_지수 {

    /*
        N 시간 동안 야근을 하여 야근 피로도를 최소화, 야근 피로도 : 남은 일의 작업량의 제곱
        일의 단위가 큰 순으로 내림차순 >
     */
    public static long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;
        for (int w : works) {
            q.add(w);
            sum += w;
        }
        if (sum <= n) return 0;

        while (n > 0) {
            int w = q.poll();
            q.add(w - 1);
            n--;
        }

        for (int w : q) {
            answer += (long) w * w;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4, new int[]{4, 3, 3}));
    }
}
