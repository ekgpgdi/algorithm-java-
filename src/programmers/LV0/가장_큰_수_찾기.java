package programmers.LV0;

import java.util.Arrays;

public class 가장_큰_수_찾기 {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = -1;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
                max = array[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{1, 8, 3}), new int[]{8, 1}));
    }
}
