package programmers.LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어_끝말잇기 {
    public static int[] solution(int n, String[] arr) {
        List<String> check = new ArrayList<>();
        check.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            String first = arr[i].substring(0, 1);
            String last = arr[i - 1].substring(arr[i - 1].length() - 1, arr[i - 1].length());

            if (!first.equals(last)) break;
            if (check.contains(arr[i])) break;

            check.add(arr[i]);
        }

        if (check.size() == arr.length) return new int[]{0, 0};

        return new int[]{check.size() % n + 1, check.size() / n + 1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}), new int[]{1, 3}));
    }
}
