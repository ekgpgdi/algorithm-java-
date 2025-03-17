package programmers.LV3;

import java.util.Arrays;

public class 정수_삼각형 {

    /*
        각 레벨에서 아래 왼쪽 아래쪽에 sum 으로 값을 더해주고 MAX 값 찾기
     */
//    public static int solution(int[][] triangle) {
//        int answer = 0;
//        int[][] tmp = new int[triangle.length][triangle[triangle.length - 1].length];
//        tmp[0][0] = triangle[0][0];
//
//        for (int i = 0; i < triangle.length - 1; i++) {
//            for (int j = 0; j < triangle[i].length; j++) {
//                tmp[i + 1][j] = Math.max(tmp[i + 1][j], triangle[i + 1][j] + tmp[i][j]);
//                tmp[i + 1][j + 1] = Math.max(tmp[i + 1][j + 1], triangle[i + 1][j + 1] + tmp[i][j]);
//
//                answer = Math.max(answer, tmp[i + 1][j]);
//                answer = Math.max(answer, tmp[i + 1][j + 1]);
//            }
//        }
//
//        return answer;
//    }

    public static int solution(int[][] triangle) {
        for (int i = 1; i < triangle.length; i++) {
            // 양 끝단은 한 쪽에서 밖에 못더하니 미리 연산 진행
            triangle[i][0] += triangle[i - 1][0];
            triangle[i][i] += triangle[i - 1][i - 1];

            // 가운데 데이터는 자신의 상위 데이터 왼쪽 오른쪽 중 더 큰 값 더하기
            for (int j = 1; j < i; j++) {
                triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
            }
        }

        return Arrays.stream(triangle[triangle.length - 1]).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }
}
