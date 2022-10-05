package programmers.LV0;

import java.util.Arrays;

public class 배열_자르기 {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{1, 2, 3, 4, 5}, 1, 3), new int[]{2, 3, 4}));
    }
}
