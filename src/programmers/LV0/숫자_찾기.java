package programmers.LV0;

public class 숫자_찾기 {
    public static int solution(int num, int k) {
        int answer = -1;
        String number = num + "";

        for(int i =0;i<number.length(); i++){
            if(Character.getNumericValue(number.charAt(i)) == k){
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(29183, 1) == 3);
    }
}
