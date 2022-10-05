package programmers.LV0;

public class 편지 {
    public static int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("happy birthday!") == 30);
    }
}
