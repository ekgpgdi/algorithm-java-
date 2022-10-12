package programmers.LV0;

public class 외계행성의_나이 {
    public static String solution(int age) {
        StringBuilder answer = new StringBuilder();

        while (age > 0) {
            answer.append((char)('a' + age % 10));
            age /= 10;
        }
        answer.reverse();
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(23).equals("cd"));
    }
}
