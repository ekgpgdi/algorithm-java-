package programmers.LV0;

import java.util.*;

public class 소인수분해 {
    public static int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();
        int i = 2;

        while (n > 1) {
            if (n % i == 0) {
                n /= i;
                answer.add(i);
            } else {
                i += 1;
            }
        }

        List<Integer> answer_list = new ArrayList<>(answer);
        Collections.sort(answer_list);

        return answer_list.stream()
                .mapToInt(ele -> ele)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(420), new int[]{2, 3, 5, 7}));
    }
}
