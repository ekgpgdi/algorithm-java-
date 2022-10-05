package programmers.LV0;

import java.util.Arrays;
import java.util.Objects;

public class 짝수_홀수_개수 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int num:num_list){
            if(num % 2 == 0) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{1, 2, 3, 4, 5}), new int[]{2, 3}));
    }
}
