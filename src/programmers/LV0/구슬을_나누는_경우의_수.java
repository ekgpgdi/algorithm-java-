package programmers.LV0;

import java.math.BigInteger;

public class 구슬을_나누는_경우의_수 {
    public static int solution(int balls, int share) {
        int answer = 1;
        BigInteger den = new BigInteger("1");
        BigInteger num = new BigInteger("1");

        for (int i = balls; i > share; i--) {
            den = den.multiply(BigInteger.valueOf(i));
        }

        for (int i = balls - share; i > 1; i--) {
            num = num.multiply(BigInteger.valueOf(i));
        }

        answer = (den.divide(num)).intValue();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(30, 5) == 142506);
    }
}
