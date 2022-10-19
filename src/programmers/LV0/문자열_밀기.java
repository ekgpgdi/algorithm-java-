package programmers.LV0;

public class 문자열_밀기 {
    public static int solution(String A, String B) {
        int answer = 0;
        String tmp_A = A;

        while (!tmp_A.equals(B)) {
            answer += 1;
            tmp_A = tmp_A.charAt(tmp_A.length() - 1) + tmp_A.substring(0, tmp_A.length() - 1);

            if(tmp_A.equals(A)) {
                return -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell") == 1);
    }
}
