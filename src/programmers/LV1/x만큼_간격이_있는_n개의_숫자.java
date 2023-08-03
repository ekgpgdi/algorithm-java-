package programmers.LV1;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x + ((long) x * i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(2, 5), new long[]{2, 4, 6, 8, 10}));
    }
}
