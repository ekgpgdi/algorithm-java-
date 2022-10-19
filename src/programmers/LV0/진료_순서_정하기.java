package programmers.LV0;

import java.util.*;

public class 진료_순서_정하기 {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        HashMap<Integer, Integer> rank = new HashMap<>();

        for(int i = 0; i< emergency.length;i++) {
            rank.put(emergency[i], i);
        }

        List<Integer> keySet = new ArrayList<>(rank.keySet());
        Collections.sort(keySet);
        Collections.reverse(keySet);

        for(int i = 0;i< keySet.size(); i++){
            answer[rank.get(keySet.get(i))] = i + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{3, 76, 24}), new int[]{3, 1, 2}));
    }
}
