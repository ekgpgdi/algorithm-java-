package programmers.LV0;

public class 주사위의_개수 {
    public static int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 8, 6},3) == 12);
    }
}
