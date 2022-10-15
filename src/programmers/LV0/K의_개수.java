package programmers.LV0;

public class K의_개수 {
    public static int solution(int i, int j, int k) {
        int answer = 0;

        while (i <= j) {
            String str_i = String.valueOf(i);
            for (int index = 0; index < str_i.length(); index++) {
                if (Character.getNumericValue(str_i.charAt(index)) == k) {
                    answer += 1;
                }
            }
            i += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1) == 6);
    }
}
