package programmers.LV0;

public class 제곱수_판별하기 {
    public static int solution(int n) {
        int answer = 2;

        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(144) == 1);
    }
}
