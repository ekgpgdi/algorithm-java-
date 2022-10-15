package programmers.LV0;

public class 종이_자르기 {
    public static int solution(int M, int N) {
        return M - 1 + (M * (N - 1));
    }

    public static void main(String[] args) {
        System.out.println(solution(2,2) == 3);
    }

}
