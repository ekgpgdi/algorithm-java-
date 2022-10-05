package programmers.LV0;

import java.util.Arrays;

public class 점의_위치_구하기 {
    public static int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0) {
            if (dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if (dot[1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4}) == 1);
    }
}
