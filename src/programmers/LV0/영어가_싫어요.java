package programmers.LV0;

public class 영어가_싫어요 {
    public static long solution(String numbers) {
        long answer = 0;
        String[] english_num = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < english_num.length; i++) {
            numbers = numbers.replace(english_num[i], String.valueOf(i));

        }

        answer = Long.parseLong(numbers);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine") == 123456789);
    }
}
