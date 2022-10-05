package programmers.LV0;

public class 피자_나눠_먹기_1 {
    public static int solution(int n) {
        int answer = 0;
        answer = n / 7;
        if (n % 7 != 0) {
            answer += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7) == 1);
    }
}
