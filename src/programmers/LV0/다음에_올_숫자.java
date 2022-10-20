package programmers.LV0;

public class 다음에_올_숫자 {
    public static int solution(int[] common) {

        if (common[0] - common[1] == common[1] - common[2]) {
            return common[common.length - 1] + common[1] - common[0];
        } else {
            return common[common.length - 1] * (common[1] / common[0]);
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}) == 5);
    }
}
