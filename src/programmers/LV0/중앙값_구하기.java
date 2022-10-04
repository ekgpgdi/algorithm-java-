package programmers.LV0;

import java.util.Arrays;

public class 중앙값_구하기 {
    public static int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length / 2];
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}) == 7);
    }
}
