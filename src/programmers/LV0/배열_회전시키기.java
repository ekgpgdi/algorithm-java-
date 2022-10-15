package programmers.LV0;

import java.util.Arrays;
import java.util.Objects;

public class 배열_회전시키기 {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(numbers.length == 1){
            return numbers;
        }

        if (Objects.equals(direction, "right")) {
            answer[0] = numbers[numbers.length - 1];
            System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
        } else {
            answer[numbers.length - 1] = numbers[0];
            System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{1, 2, 3}, "right"), new int[]{3, 1, 2}));
    }
}
