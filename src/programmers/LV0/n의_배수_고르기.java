package programmers.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n의_배수_고르기 {
    public static int[] solution(int n, int[] numlist) {
        int[] answer;
        List<Integer> answerArray = new ArrayList<Integer>();

        for (int num : numlist) {
            if (num % n == 0) {
                answerArray.add(num);
            }
        }

        answer = new int[answerArray.size()];

        for (int i = 0; i < answerArray.size(); i++) {
            answer[i] = answerArray.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}), new int[]{6, 9, 12}));
    }
}
