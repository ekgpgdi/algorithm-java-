package programmers.LV0;

public class 숨어있는_숫자의_덧셈_2 {
    public static int solution(String my_string) {
        int answer = 0;
        int number = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                if(number == 0) {
                    number = my_string.charAt(i) - '0';
                } else {
                    number = number * 10 + my_string.charAt(i) - '0';
                }
            } else {
                answer += number;
                number = 0;
            }
        }

        if(number != 0) {
            answer += number;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("123s1") == 124);
    }
}
