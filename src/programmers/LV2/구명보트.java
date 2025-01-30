package programmers.LV2;

import java.util.Arrays;

public class 구명보트 {

    public static int solution(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);

        int lt = 0;
        int rt = people.length - 1;

        while (lt <= rt) {
            if (people[lt] + people[rt] <= limit) {
                count++;
                lt++;
                rt--;

            } else {
                count ++;
                rt --;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 50, 80, 50}, 100) == 3);
    }
}
