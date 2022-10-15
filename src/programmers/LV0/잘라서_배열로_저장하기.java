package programmers.LV0;

import java.util.Arrays;

public class 잘라서_배열로_저장하기 {
    public static String[] solution(String my_str, int n) {
        int size;
        if (my_str.length() % n == 0) {
            size = my_str.length() / n;
        } else {
            size = my_str.length() / n + 1;
        }
        String[] answer = new String[size];

        for (int i = 0; i < size; i++) {
            if (my_str.length() > n * (i + 1)) {
                if (i == 0) {
                    answer[i] = my_str.substring(0, n * (i + 1));
                } else {
                    answer[i] = my_str.substring(n * i, n * (i + 1));
                }
            } else {
                answer[i] = my_str.substring(n * i, my_str.length());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution("abc1Addfggg4556b", 6), new String[]{"abc1Ad", "dfggg4", "556b"}));
    }
}
