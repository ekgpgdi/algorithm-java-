package programmers.LV0;

public class 삼각형의_완성조건_2 {
    public static int solution(int[] sides) {
        int answer = 0;
        int i = 0;

        while (true) {
            i += 1;
            if (sides[0] <= i && sides[1] <= i && sides[0] + sides[1] > i) {
                answer += 1;
            } else if (Math.max(sides[0], sides[1]) >= i && Math.min(sides[0], sides[1]) + i > Math.max(sides[0], sides[1])) {
                answer += 1;
            }

            if (Math.max(sides[0], sides[1]) < i && sides[0] + sides[1] <= i) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}) == 1);
    }
}
