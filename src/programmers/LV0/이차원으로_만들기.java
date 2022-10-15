package programmers.LV0;

import java.util.Arrays;
import java.util.Objects;

public class 이차원으로_만들기 {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int j = 0;

        for (int i = 0; i < num_list.length; i++) {
            answer[j][i % n] = num_list[i];
            if ((i + 1) % n == 0) {
                j += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3), new int[][]{{100, 95, 2}, {4, 5, 6}, {18, 33, 948}}));
    }
}
