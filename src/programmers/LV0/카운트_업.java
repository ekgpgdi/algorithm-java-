package programmers.LV0;

import java.math.BigInteger;
import java.util.Arrays;

public class 카운트_업 {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        int index = 0;
        for(int move_num = start_num; move_num <= end_num; move_num ++) {
            answer[index] = move_num;
            index ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(3, 10), new int[]{3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
