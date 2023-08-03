package programmers.LV1;

public class 자릿수_더하기 {
    public static int solution(int n) {
        int answer = 0;

        String number = String.valueOf(n);

        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - 48 ;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123) == 6);
    }
}
