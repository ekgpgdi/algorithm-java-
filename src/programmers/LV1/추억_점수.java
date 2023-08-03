package programmers.LV1;

import java.util.Arrays;
import java.util.HashMap;

public class 추억_점수 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hashMap.put(name[i], yearning[i]);
        }

        int sum = 0;
        for (int i = 0; i < photo.length; i++) {
            sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (hashMap.containsKey(photo[i][j])) {
                    sum += hashMap.get(photo[i][j]);
                }
            }

            answer[i] = sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}),
            new int[]{19, 15, 6}));
    }
}
