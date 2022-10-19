package programmers.LV0;

public class 가까운_수 {
    public static int solution(int[] array, int n) {
        int answer = 0;
        int diff = array[0] > n ? array[0] - n : n - array[0];

        for (int i = 1; i < array.length; i++) {

            if((array[i] > n ? array[i] - n : n - array[i]) < diff) {
                diff = array[i] > n ? array[i] - n : n - array[i];
                answer = i;
            } else if ((array[i] > n ? array[i] - n : n - array[i])  == diff) {
                answer = array[i] < array[answer] ? i : answer;
            }
        }

        answer = array[answer];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20) == 28);
    }
}
