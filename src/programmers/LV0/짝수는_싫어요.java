package programmers.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 짝수는_싫어요 {
    public static int[] solution(int n) {
        int[] answer;
        List<Integer> sortArray = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                sortArray.add(i);
            }
        }

        answer = sortArray.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(10), new int[]{1, 3, 5, 7, 9}));
    }
}
