package programmers.LV2;

public class 피보나치_수 {

    public static int solution(int n) {
        int[] num = new int[n + 1];

        if (n < 2) {
            return 1;
        } else {
            num[1] = 1;
            num[2] = 1;
            for (int i = 3; i <= n; i++) {
                num[i] = ((num[i - 1] % 1234567) + (num[i - 2] % 1234567)) % 1234567;
            }
        }
        return num[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
