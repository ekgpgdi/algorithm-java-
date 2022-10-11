package programmers.LV0;

public class 특정_문자_제거하기 {
    public static String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) != letter.charAt(0)){
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f").equals("abcde"));
    }
}
