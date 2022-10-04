package programmers.LV0;

import java.util.Arrays;
import java.util.Objects;

public class 배열_원소의_길이 {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new String[]{"We", "are", "the", "world!"}), new int[]{2, 3, 3, 6}));
    }
}
