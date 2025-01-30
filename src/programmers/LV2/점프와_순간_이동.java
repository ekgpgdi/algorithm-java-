package programmers.LV2;

public class 점프와_순간_이동 {
    public static int solution(int n) {
        int answer = 0;
        while (n > 1) {
            if (n % 2 == 1) answer++;
            n /= 2;
        }
        return answer + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5000) == 5);
    }
}

