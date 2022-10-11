package programmers.LV0;

import java.util.Arrays;

public class 배열_뒤집기 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[num_list.length - 1 - i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{1, 2, 3, 4, 5}), new int[]{5, 4, 3, 2, 1}));
    }
}
