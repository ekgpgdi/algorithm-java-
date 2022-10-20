package programmers.LV0;

import java.util.*;

public class 등수_매기기 {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Double[] ave = new Double[score.length];
        List<Double> ave_list = new ArrayList<>();
        double ave_score;

        for (int i = 0; i < score.length; i++) {
            ave_score = (score[i][0] + score[i][1]) / 2.0;
            ave[i] = ave_score;
            ave_list.add(ave_score);

        }

        ave_list.sort(Collections.reverseOrder());


        for (int i = 0; i < ave.length; i++) {
            answer[i] = ave_list.indexOf(ave[i]) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}}), new int[]{1, 2, 4, 3}));
    }
}
