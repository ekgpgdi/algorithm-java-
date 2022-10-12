package programmers.LV0;

public class 칠의_개수 {
    public static int solution(int[] array) {
        int answer = 0;

        for (int ele : array) {
            String tmp_num = String.valueOf(ele);

            for (int i = 0; i < tmp_num.length(); i++) {
                if (tmp_num.charAt(i) == '7') {
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17}) == 4);
    }
}
