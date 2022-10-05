package programmers.LV0;

import java.util.Arrays;

public class 최댓값_만들기_1 {
    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}) == 20);
    }
}
