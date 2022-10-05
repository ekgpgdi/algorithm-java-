package programmers.LV0;

public class 문자열_뒤집기 {
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(int i = my_string.length() - 1; i >= 0; i--){
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("jaron").equals("noraj"));
    }
}
