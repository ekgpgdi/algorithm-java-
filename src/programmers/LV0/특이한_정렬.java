package programmers.LV0;

import java.util.*;

public class 특이한_정렬 {
    public static int[] solution(int[] numlist, int n) {
        int tmp;

        for (int i = 0; i < numlist.length; i++) {
            for(int j = i; j < numlist.length; j++) {
                if((numlist[i] > n ? numlist[i] - n : n - numlist[i]) > (numlist[j] > n ? numlist[j] - n : n - numlist[j])){
                    tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                } else if ((numlist[i] > n ? numlist[i] - n : n - numlist[i]) == (numlist[j] > n ? numlist[j] - n : n - numlist[j])) {
                    if(numlist[j] > numlist[i]){
                        tmp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = tmp;
                    }

                }
            }
        }

        return numlist;

//        int[] answer = new int[numlist.length];
//        Map<Integer, ArrayList<Integer>> minus = new HashMap<>();
//
//        for (int i = 0; i < numlist.length; i++) {
//            if (!minus.containsKey(numlist[i] > n ? numlist[i] - n : n - numlist[i])) {
//                ArrayList<Integer> new_ArrayList = new ArrayList<>();
//                new_ArrayList.add(numlist[i]);
//                minus.put(numlist[i] > n ? numlist[i] - n : n - numlist[i], new_ArrayList);
//            } else {
//                ArrayList<Integer> get_ArrayList = minus.get(numlist[i] > n ? numlist[i] - n : n - numlist[i]);
//                get_ArrayList.add(numlist[i]);
//                minus.put(numlist[i] > n ? numlist[i] - n : n - numlist[i], get_ArrayList);
//            }
//
//        }
//
//        List<Integer> keyList = new ArrayList<>(minus.keySet());
//        keyList.sort((s1, s2) -> s1.compareTo(s2));
//
//        int cnt = 0;
//
//        for (int i = 0; i < keyList.size(); i++) {
//            ArrayList<Integer> value_ArrayList = minus.get(keyList.get(i));
//            Collections.sort(value_ArrayList, Collections.reverseOrder());
//
//            for(int j = 0; j<value_ArrayList.size(); j ++){
//                answer[cnt ++] = value_ArrayList.get(j);
//            }
//        }
//
//        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 11}, 6), new int[]{6, 7, 5, 8, 4, 9, 3, 10, 2, 11, 1}));
    }
}
