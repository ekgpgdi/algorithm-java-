package programmers.LV0;

public class 각도기 {
    public static int solution(int angle) {
        int answer = 0;

        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(70) == 1);
    }
}
