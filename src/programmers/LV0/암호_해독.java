package programmers.LV0;

public class 암호_해독 {
    public static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < cipher.length(); i++) {
            if((i + 1) % code == 0){
                answer.append(cipher.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4).equals("attack"));
    }
}
