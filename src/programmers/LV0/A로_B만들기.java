package programmers.LV0;

public class A로_B만들기 {
    public static int solution(String before, String after) {
        for (int i = 0; i < before.length(); i++) {
            after = after.replaceFirst(String.valueOf(before.charAt(i)), "");
        }

        if(after.length() == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello") == 1);
    }
}
