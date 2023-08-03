package programmers.LV1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {
    public static int[] solution(long n) {
        String number = String.valueOf(n);
        int[] answer = new int[number.length()];

        int index = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            answer[index] = number.charAt(i) - 48;
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(12345), new int[]{5, 4, 3, 2, 1}));
    }
}
