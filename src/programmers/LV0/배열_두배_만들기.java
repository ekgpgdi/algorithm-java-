package programmers.LV0;

import java.util.Arrays;

public class 배열_두배_만들기 {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{1, 2, 3, 4, 5}), new int[]{2, 4, 6, 8, 10}));
    }
}
