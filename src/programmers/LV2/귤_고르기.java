package programmers.LV2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 귤_고르기 {

    public static int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for (int i : tangerine) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);

                if (map.get(i) >= k) return 1;
            } else {
                map.put(i, 1);
            }
        }

        int[] arr = new int[map.size()];
        int index = 0;
        for (Integer i : map.keySet()) {
            arr[index] = map.get(i);
            index++;
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            k -= arr[i];
            answer ++;
            if(k <= 0) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}) == 3);
    }
}
