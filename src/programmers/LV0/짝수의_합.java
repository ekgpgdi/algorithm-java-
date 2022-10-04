package programmers.LV0;

public class 짝수의_합 {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i+= 2) {
            answer += i;
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(10) == 30);
    }
}
