package programmers.LV3;

import java.util.*;

public class 등굣길 {

    /*
        집 : 1,1 학교 : m,n
        puddles: 물에 잠긴 지역
        오른쪽과 아래쪽으로만 움직일 수 있음
     */
    public static int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n + 1][m + 1];

        for (int i = 0; i < puddles.length; i++) {
            map[puddles[i][1]][puddles[i][0]] = -1;
        }

        map[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == 0) {
                    if (map[i - 1][j] != -1) map[i][j] += map[i - 1][j]% 1000000007;
                    if (map[i][j - 1] != -1) map[i][j] += map[i][j - 1]% 1000000007;
                }
            }
        }

        return map[n][m];
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 3, new int[][]{{2, 2}}));
    }
}
