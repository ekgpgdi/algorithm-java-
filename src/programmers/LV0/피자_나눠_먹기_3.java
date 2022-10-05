package programmers.LV0;

public class 피자_나눠_먹기_3 {
    public static int solution(int slice, int n) {
        int answer = 0;

        answer = n / slice;

        if (n % slice != 0) {
            answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 12) == 3);
    }
}
