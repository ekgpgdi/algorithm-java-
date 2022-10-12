package programmers.LV0;

public class 합성수_찾기 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10) == 5);
    }
}
