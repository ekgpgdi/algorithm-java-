package programmers.LV0;

public class 삼육구게임 {
    public static int solution(int order) {
        int answer = 0;

        while (order > 0) {
            if (order % 10 % 3 == 0 && order % 10 != 0) {
                answer += 1;
            }
            order /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1000000) == 0);
    }
}
