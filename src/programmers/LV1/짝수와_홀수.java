package programmers.LV1;

import java.util.Arrays;

public class 짝수와_홀수 {
    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(solution(3).equals("Odd"));
    }
}
