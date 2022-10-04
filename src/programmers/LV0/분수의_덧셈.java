package programmers.LV0;

import java.util.Arrays;

public class 분수의_덧셈 {

    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int denominator = num1 * num2;
        int numerator = (denum1 * num2) + (denum2 * num1);

        int i = Math.max(denominator, numerator);

        for (; i > 0 ; i--) {
            if (denominator % i == 0 && numerator % i == 0) {
                denominator /= i;
                numerator /= i;
            }
        }

        answer[0] = numerator;
        answer[1] = denominator;

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(1, 2, 3, 4), new int[]{5, 4}));
    }
}