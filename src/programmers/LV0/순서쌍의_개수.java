package programmers.LV0;

public class 순서쌍의_개수 {
    public static int solution(int n) {
        int answer = 0;
        boolean same = false;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (n / i < i) {
                    break;
                }
                answer += 1;

                if (n / i == i) {
                    same = true;
                }
            }
        }

        answer *= 2;

        if (same) {
            answer -= 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1) == 1);
    }
}
