package programmers.LV2;

import java.util.*;

public class 연속_부분_수열_합의_개수 {
    /*
     원형 수열 (처음과 끝이 연결된) 의 연속 부분 수열 합으로 만들 수 있는 수의 개수
     배열의 크기를 늘려서 연결리스트처럼 사용
     */
    public static int solution(int[] arr) {
        int[] arrCopy = new int[arr.length * 2];

        Set<Integer> answerSet = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
            arrCopy[i + arr.length] = arr[i];
            sum += arr[i];
        }
        answerSet.add(sum);

        for (int lt = 0; lt < arr.length; lt++) {
            sum = 0;
            for (int rt = lt, count = 0; count < arr.length - 1; rt++, count++) {
                sum += arrCopy[rt];
                answerSet.add(sum);
            }
        }

        return answerSet.size();
    }

    /*
    다른 사람 답변
    : dp 에 처음에는 각 인덱스의 데이터를 넣고, 반복으로 각 다음 인덱스 데이터를 합해감
    > 이 합 데이터를 set 에 저장
     */
    public int OtherSolutions(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int[] dp = new int[arr.length];
        for (int len = 1; len <= arr.length; len++) {
            for (int i = 0; i < arr.length; i++) {
                dp[i] += arr[(len + i - 1) % arr.length];
                set.add(dp[i]);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 9, 1, 1, 4}) == 18);
    }
}
