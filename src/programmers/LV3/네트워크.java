package programmers.LV3;

import java.util.LinkedList;
import java.util.Queue;

public class 네트워크 {

    /*
        1부터 시작해서 네트워크 연결하고 체크 배열로 연결 안된 추가 네트워크 찾아다니기
     */
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        int ch[] = new int[n];


        for (int i = 0; i < n; i++) {
            if (ch[i] != 1) {
                answer++;

                Queue<Integer> q = new LinkedList<>();
                q.add(i);

                while (!q.isEmpty()) {
                    int tmp = q.poll();
                    ch[tmp] = 1;

                    for (int j = 0; j < n; j++) {
                        if (computers[tmp][j] == 1 && ch[j] != 1) q.add(j);
                    }
                }
            }

        }
        return answer;
    }

    // DFS 를 통해
    public static int solutionDfs(int n, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!chk[i]) {
                dfs(computers, chk, i);
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(int[][] computers, boolean[] chk, int start) {
        chk[start] = true;
        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !chk[i]) {
                dfs(computers, chk, i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }
}
