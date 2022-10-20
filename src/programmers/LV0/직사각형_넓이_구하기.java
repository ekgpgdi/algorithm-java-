package programmers.LV0;

public class 직사각형_넓이_구하기 {
    public static int solution(int[][] dots) {
        int max_x = -256;
        int min_x = 256;
        int max_y = -256;
        int min_y = 256;

        for(int i =0;i<dots.length;i++){
            if(max_x < dots[i][0]){
                max_x = dots[i][0];
            } else if (min_x > dots[i][0]) {
                min_x = dots[i][0];
            }
            if(max_y < dots[i][1]) {
                max_y = dots[i][1];
            } else if (min_y > dots[i][1]) {
                min_y = dots[i][1];
            }
        }

        return (max_x - min_x) * (max_y - min_y);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}) == 1);
    }
}
