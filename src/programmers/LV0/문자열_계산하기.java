package programmers.LV0;

public class 문자열_계산하기 {
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replace(" ", "");
        String[] plus_sub = my_string.split("\\+");

        for (int i = 0; i < plus_sub.length; i++) {
            String[] minus_sub = plus_sub[i].split("\\-");
            if (minus_sub.length > 1) {
                answer += Integer.parseInt(minus_sub[0]);

                for (int j = 1; j < minus_sub.length; j++) {
                    answer -= Integer.parseInt(minus_sub[j]);
                }
            } else {
                answer += Integer.parseInt(plus_sub[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("20000 + 1 - 1") == 20000);
    }
}
