package programmers.LV2;

public class 멀리_뛰기 {
    public static long solution(int n) {
        long[] cache = new long[n + 1];

        cache[0] = 1;
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = (cache[i - 1] + cache[i - 2]) % 1234567;
        }
        return cache[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(4) == 5);
    }
}

