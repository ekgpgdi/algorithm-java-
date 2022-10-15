package programmers.LV0;

public class 최댓값_만들기_2 {
    public static int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;

        if (numbers.length == 1) {
            return numbers[0];
        } else if(numbers.length == 2){
            return numbers[0] * numbers[1];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] <= 0 && numbers[j] <= 0) || (numbers[i] >= 0 && numbers[j] >= 0)) {
                    if (answer < numbers[i] * numbers[j]) {
                        answer = numbers[i] * numbers[j];
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-10000, 10000}) == -10000 * 10000);
    }
}
