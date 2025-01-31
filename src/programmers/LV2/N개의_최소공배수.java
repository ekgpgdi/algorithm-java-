package programmers.LV2;

import java.util.Arrays;

public class N개의_최소공배수 {
    public static int solution(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int num = gcd(arr[i + 1], arr[i]);
            // 최소공배수(LCM) 계산: (a * b) / GCD(a, b)
            arr[i + 1] = (arr[i] * arr[i + 1]) / num;
        }

        return arr[arr.length - 1];
    }

    // 최소 공약수를 구하는 유클리드 호제법
    private static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 8, 14}));
    }
}
