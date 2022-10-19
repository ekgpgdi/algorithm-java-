package programmers.LV0;

public class 공_던지기 {
    public static int solution(int[] numbers, int k) {
        int answer = 0;
        k -= 1;

        while (k > 0) {
            answer += 2;
            if(answer > numbers.length - 1) {
                answer %= numbers.length;
            }
            k -= 1;
        }

        answer += 1;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, 3) == 1);
    }
}
