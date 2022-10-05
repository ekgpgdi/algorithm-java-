package programmers.LV0;

public class 양꼬치 {
    public static int solution(int n, int k) {
        int answer = 0;
        int lamb = 12000;
        int drinking = 2000;

        answer = lamb * n + drinking * k;

        if(n >= 10) {
            answer -= drinking * (n / 10);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 3) == 124000);
    }
}
