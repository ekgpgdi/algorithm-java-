package programmers.LV2;

import java.util.Arrays;

public class 카펫 {

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[]{0, 0};

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0 && (yellow / i) * 2 + (i * 2 + 4) == brown) {
                answer[0] = (yellow / i) + 2;
                answer[1] = i + 2;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(10, 2), new int[]{4, 3}));
    }
}
