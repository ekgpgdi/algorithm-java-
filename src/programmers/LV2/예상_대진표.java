package programmers.LV2;

public class 예상_대진표 {
    public static int solution(int n, int a, int b) {
        int answer = 0;

        if (a > b) {
            int tmp = b;
            b = a;
            a = tmp;
        }

        do {
            a = a / 2 + a % 2 ;
            b = b / 2 + b % 2 ;
            answer++;

        } while (a != b);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7) == 3);
    }
}

