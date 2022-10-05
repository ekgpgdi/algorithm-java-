package programmers.LV0;

public class 옷가게_할인_받기 {
    public static int solution(int price) {
        int answer = 0;

        if (price >= 500000) {
            answer = (int) ((double) price * 0.8);
        } else if (price >= 300000) {
            answer = (int) ((double) price * 0.9);
        } else if (price >= 100000) {
            answer = (int) ((double) price * 0.95);
        } else {
            answer = price;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(150000) == 142500);
    }
}
