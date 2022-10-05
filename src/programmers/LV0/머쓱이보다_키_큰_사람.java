package programmers.LV0;

public class 머쓱이보다_키_큰_사람 {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int ele:array){
            if( ele > height) {
                answer += 1;
            }
         }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167) == 3);
    }
}
