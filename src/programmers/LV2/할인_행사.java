package programmers.LV2;

import java.util.HashMap;
import java.util.Map;

public class 할인_행사 {
    /*
        10일간 discount 품목이 want 의 품목을 number 의 수량 만큼 구매할 수 있는 날짜의 수 응답
     */

    public static boolean compare(Map<String, Integer> map, String[] want, int[] number) {

        for (int i = 0; i < want.length; i++) {
            if (map.containsKey(want[i])) {
                if (map.get(want[i]) < number[i]) return false;
            } else return false;
        }
        return true;
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int lt = 0, rt = 9, answer = 0;
        Map<String, Integer> map = new HashMap<>();

        while (rt < discount.length) {
            map.clear();

            for (int i = lt; i <= rt; i++) {
                if (map.containsKey(discount[i])) {
                    map.put(discount[i], map.get(discount[i]) + 1);
                } else {
                    map.put(discount[i], 1);
                }
            }

            if (compare(map, want, number)) answer++;
            lt++;
            rt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}
