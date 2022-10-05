package programmers.LV0;

import java.util.Arrays;
import java.util.Locale;

public class 문자열_정렬하기_2 {
    public static String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase(Locale.ROOT);
        char[] sort_string = my_string.toCharArray();
        Arrays.sort(sort_string);

        answer = new String(sort_string);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Bcad").equals("abcd"));
    }
}
