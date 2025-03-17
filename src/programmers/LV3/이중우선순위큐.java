package programmers.LV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

public class 이중우선순위큐 {

    /*
        명령어에 따라 큐 삽입, 최댓값 삭제, 최솟값 삭제 진행
        모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]을 return
     */
    public static int[] solution(String[] operations) {
        ArrayList<Integer> q = new ArrayList<>();
        for (String s : operations) {
            if (s.startsWith("I")) {
                int a = Integer.parseInt(s.split("I ")[1]);
                q.add(a);
                Collections.sort(q);
            } else if (s.equals("D 1")) {
                if (q.size() > 0) q.remove(q.size() - 1);
            } else {
                if (q.size() > 0) q.remove(0);
            }
        }

        if (q.size() == 0) return new int[]{0, 0};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : q) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        return new int[]{max, min};
    }


    public static void main(String[] args) {
        int[] answer = solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});
        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
