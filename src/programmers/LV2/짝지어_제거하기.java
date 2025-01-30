package programmers.LV2;

import java.util.Stack;

public class 짝지어_제거하기 {

    public static int solution(String str) {
        Stack<Character> stack = new Stack<>();
        char[] cList = str.toCharArray();

        for (char c : cList) {
            if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }
}
