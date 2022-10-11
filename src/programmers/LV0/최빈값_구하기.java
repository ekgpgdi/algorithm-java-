package programmers.LV0;

import java.util.HashMap;

public class 최빈값_구하기 {
    public static int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        for (int arr : array) {
            if (count.containsKey(arr)) {
                count.replace(arr, count.get(arr) + 1);
            } else {
                count.put(arr, 1);
            }
        }

        int max = -1;

        for (int key : count.keySet()) {
            if (max < count.get(key)) {
                max = count.get(key);
                answer = key;
            } else if (max == count.get(key)) {
                answer = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}) == 3);
    }
}
