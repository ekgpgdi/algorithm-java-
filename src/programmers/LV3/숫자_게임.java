package programmers.LV3;

import java.util.Arrays;

public class 숫자_게임 {
    static int max = 0;
    static int[] p;
    static int[] answer;

    /*
        출전 순위를 조정하여 B 팀이 얻는 최대 승점
        = A 팀보다 큰 수의 수
   */
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        int Ai = 0;
        int Bi = 0;


        while (Bi < B.length && Ai < A.length) {
            if (A[Ai] < B[Bi]) {
                answer++;
                Ai++;
            }
            Bi++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 1, 3, 7}, new int[]{2,2,6,8}));
    }
}
