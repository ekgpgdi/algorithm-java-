package programmers.LV0;

public class 몫_구하기 {
    public static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 / num2;

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(10, 5) == 2);
    }
}
