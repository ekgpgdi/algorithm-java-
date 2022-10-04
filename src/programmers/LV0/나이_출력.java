package programmers.LV0;

public class 나이_출력 {
    public static int solution(int age) {
        int answer = 0;
        int year = 2022;
        answer = year - age + 1;
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(40) == 1983);
    }
}
