package programmers.LV0;

import java.util.Objects;

public class 컨트롤_제트 {
    public static int solution(String s) {
        int answer = 0;
        String[] s_array = s.split(" ");
        int[] stack = new int[s_array.length];
        int index = 0;

        for (int i = 0; i < s_array.length; i++) {
            if (Objects.equals(s_array[i], "Z")) {
                index--;
            } else {
                stack[index++] = Integer.parseInt(s_array[i]);
            }
        }

        for (int i = 0; i < index; i++) {
            answer += stack[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 Z Z") == 1);
    }
}
