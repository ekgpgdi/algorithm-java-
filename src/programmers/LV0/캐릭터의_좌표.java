package programmers.LV0;

import java.util.Arrays;

public class 캐릭터의_좌표 {
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        for (String key : keyinput) {
            if (key.equals("left") || key.equals("right")) {
                if (key.equals("left")) {
                    if (answer[0] - 1 >= -(board[0] / 2)) {
                        answer[0] -= 1;
                    }
                } else {
                    if (answer[0] + 1 <= board[0] / 2) {
                        answer[0] += 1;
                    }
                }
            } else {
                if (key.equals("down")) {
                    if (answer[1] - 1 >= -(board[1] / 2)) {
                        answer[1] -= 1;
                    }
                } else {
                    if (answer[1] + 1 <= board[1] / 2) {
                        answer[1] += 1;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}), new int[]{2, 1}));
    }
}
