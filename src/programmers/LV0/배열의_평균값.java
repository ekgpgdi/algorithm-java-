package programmers.LV0;

public class 배열의_평균값 {
    public static double solution(int[] numbers) {
        double answer = 0;
        for(int num:numbers){
            answer += num;
        }
        answer /= numbers.length;
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}) == 5.5);
    }
}
