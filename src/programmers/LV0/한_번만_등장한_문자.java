package programmers.LV0;

import java.util.Objects;

public class 한_번만_등장한_문자 {
    public static String solution(String s) {
        String answer = s;

        for (int i = 0; i < answer.length(); i++) {
            if(answer.substring(i+1,answer.length()).contains(String.valueOf(answer.charAt(i)))) {
                s = s.replace(String.valueOf(answer.charAt(i)), "");
            }
        }

        answer = s.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Objects.equals(solution("abcabcadc"), "d"));
    }
}
