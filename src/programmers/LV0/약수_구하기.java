package programmers.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 약수_구하기 {
    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> mineral = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                mineral.add(i);
            }
        }

        answer = mineral.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(24), new int[]{1, 2, 3, 4, 6, 8, 12, 24}));
    }
}
