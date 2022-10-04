package programmers.LV0;

public class 두_수의_나눗셈 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = (int) ((double) num1 / (double) num2 * 1000);
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(3, 2) == 1500);
    }
}
