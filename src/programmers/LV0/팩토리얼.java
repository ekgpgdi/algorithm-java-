package programmers.LV0;

public class 팩토리얼 {
    public static int solution(int n) {
        int answer = 0;
        int factorial = 1;

        for (int i = 2; factorial <= n; i++) {
            factorial *= i;

            if (factorial == n) {
                answer = i;
            } else if (factorial > n) {
                answer = i - 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3628800) == 10);
    }

}
