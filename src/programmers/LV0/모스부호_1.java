package programmers.LV0;

import java.util.Arrays;
import java.util.Objects;

public class 모스부호_1 {
    public static String solution(String letter) {
        String[] mos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String answer = "";
        String[] letter_mos = letter.split(" ");

        for (int i = 0; i < letter_mos.length; i++) {
            int index = Arrays.asList(mos).indexOf(letter_mos[i]);
            letter_mos[i] = String.valueOf((char)(index + 'a'));
        }

        answer = String.join("",letter_mos);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Objects.equals(solution(".... . .-.. .-.. ---"), "hello"));
    }
}
