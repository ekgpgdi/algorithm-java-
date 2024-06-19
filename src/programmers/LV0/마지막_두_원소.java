package programmers.LV0;

import java.util.Arrays;
import java.util.HashMap;

public class 마지막_두_원소 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int index =0;
        for(int num : num_list) {
            answer[index] = num;
            index ++;
        }

        int lastNum = 0;

        if(num_list[num_list.length -1] > num_list[num_list.length -2]) {
            lastNum = num_list[num_list.length -1] -1;
        } else {
            lastNum = num_list[num_list.length -1] * 2;
        }

        answer[answer.length - 1] = lastNum;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{2, 1, 6}), new int[]{2, 1, 6, 5}));
    }
}
