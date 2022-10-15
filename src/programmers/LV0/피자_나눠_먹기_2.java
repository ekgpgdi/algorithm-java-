package programmers.LV0;

public class 피자_나눠_먹기_2 {
    public static int solution(int n) {
        int answer = 0;

        while (true) {
            answer += 1;
            if (6 * answer % n == 0) {
                return answer;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(6) == 1);
    }
}
