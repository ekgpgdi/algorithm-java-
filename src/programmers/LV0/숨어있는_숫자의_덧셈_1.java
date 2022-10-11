package programmers.LV0;

import java.util.Arrays;

public class 숨어있는_숫자의_덧셈_1 {
    public static int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))){
                answer += Character.getNumericValue(my_string.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp") == 10);
    }
}
