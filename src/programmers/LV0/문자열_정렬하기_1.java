package programmers.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열_정렬하기_1 {
    public static int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> sortArray = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                sortArray.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }

        Collections.sort(sortArray);
        answer = sortArray.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution("hi12392"), new int[]{1, 2, 2, 3, 9}));
    }
}
