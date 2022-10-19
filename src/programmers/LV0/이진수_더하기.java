package programmers.LV0;

import java.util.Objects;

public class 이진수_더하기 {
    public static String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    public static void main(String[] args) {
        System.out.println(Objects.equals(solution("10", "11"), "101"));
    }
}
