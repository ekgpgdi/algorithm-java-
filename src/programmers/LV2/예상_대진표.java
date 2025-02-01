package programmers.LV2;

public class 예상_대진표 {
    public static int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            if (a % 2 == 1) a++;
            if (b % 2 == 1) b++;

            a = a / 2 + 1;
            b = b / 2 + 1;
            answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7) == 3);
    }
}

