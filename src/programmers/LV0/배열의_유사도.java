package programmers.LV0;


public class 배열의_유사도 {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String value : s1) {
            for (String s : s2) {
                if (value.equals(s)) {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}) == 2);
    }
}
