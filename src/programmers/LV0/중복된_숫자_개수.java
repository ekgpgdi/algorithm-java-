package programmers.LV0;

import java.util.*;
import java.util.stream.Collectors;

public class 중복된_숫자_개수 {
    public static int solution(int[] array, int n)  {
        int answer = 0;

        for(int ele : array) {
            if(ele == n){
                answer += 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1) == 2);
    }
}
