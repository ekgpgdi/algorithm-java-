package programmers.LV3;

import java.util.Arrays;
import java.util.Comparator;

public class 단속카메라 {

    /*
        모든 차량이 한 번은 단속용 카메라를 만나도록 하려면 최소 몇 대의 카메라를 설치해야 하는지
        각 차량의 진입 지점을 기준으로 오름차순
        -> 진출 지점에 카메라를 둔다고 생각하고 해당 카메라에 찍히지 못하면 ++

     */
    public static int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));

        int camera = routes[0][1];
        for(int i =1; i < routes.length; i++) {
            if(routes[i][0] > camera
                    || routes[i][1] < camera) {
                answer ++;
                camera = routes[i][1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}}));
    }
}
