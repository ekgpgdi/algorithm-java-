package programmers.LV0;

import java.util.Arrays;

public class 아이스_아메리카노 {
    public static int[] solution(int money) {
        int[] answer = new int[2];
        int americano = 5500;

        answer[0] = money / americano;
        answer[1] = money % americano;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(5500), new int[]{1, 0}));
    }
}
