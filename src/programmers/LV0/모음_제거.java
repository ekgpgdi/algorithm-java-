package programmers.LV0;

import java.util.Arrays;

public class 모음_제거 {
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] vowel = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < my_string.length(); i++) {
            if (!Arrays.asList(vowel).contains((my_string.charAt(i) + ""))) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("bus").equals("bs"));
    }
}
