package programmers.LV0;

public class 중복된_문자_제거 {
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (!answer.toString().contains(my_string.charAt(i) + "")) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("people").equals("peol"));
    }
}
