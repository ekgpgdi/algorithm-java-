package programmers.LV2;

public class N제곱_배열_자르기 {

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];

        int index =0;
        for(long i = left; i <= right; i++) {
            int x = (int) (i / n);
            int y = (int) (i % n);

            answer[index ++] = Math.max(x,y) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(23,2,5);

        for(int a : answer) System.out.print(a + " ");
    }
}
