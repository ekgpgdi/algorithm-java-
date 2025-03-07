package programmers.LV2;


import java.util.Stack;

public class 괄호_회전하기 {
    /*
    s 를 왼쪽으로 0 < x < s 칸 만큼 회전 시켰을 대 s가 올바른 괄호 문자열이 되게 하는 x의 개수
     */
    public static int changeToInt(char c) {
        return switch (c) {
            case '(', ')' -> 1;
            case '[', ']' -> 2;
            case '{', '}' -> 3;
            default -> 0;
        };
    }

    public static String shift(String s) {
        char[] tmpC = new char[s.length()];

        for (int i = 1; i < s.length(); i++) {
            tmpC[i] = s.charAt(i - 1);
        }
        tmpC[0] = s.charAt(s.length() - 1);

        return String.valueOf(tmpC);
    }

    public static int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) { // 회전 수
            stack.clear();
            answer++;
            boolean check = false;
            for (int j = 0; j < s.length(); j++) { // 문자열 반복
                if (s.charAt(j) == '[' || s.charAt(j) == '(' || s.charAt(j) == '{') {
                    stack.push(changeToInt(s.charAt(j)));
                } else {
                    if (stack.isEmpty() || stack.pop() != changeToInt(s.charAt(j))) {
                        check = true;
                        break;
                    }
                }
            }
            if (!stack.isEmpty() || check) answer--;
            s = shift(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("{(})"));
    }
}
