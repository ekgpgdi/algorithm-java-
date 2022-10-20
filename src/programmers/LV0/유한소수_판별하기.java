package programmers.LV0;

public class 유한소수_판별하기 {
    public static int solution(int a, int b) {
        for (int i = 2; i < (Math.min(a, b)); ) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            } else {
                i += 1;
            }
        }

        int i = 2;
        while (b > 1) {
            if (b % i == 0) {
                b /= i;
            } else {
                i = 5;
            }

            if (i == 5 && b != 1 && b % i != 0) {
                return 2;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(11, 22) == 1);
    }
}
