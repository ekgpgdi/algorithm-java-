package programmers.LV2;

public class N개의_최소공배수 {
    public static int solution(int[] arr) {
        int answer = 1;
        int divide = 2;
        boolean check = true;

        while(true) {
            for(divide = 2; divide <= 3; divide ++) {
                check = true;
                for(int i =0; i < arr.length; i++) {
                    if(arr[i] % divide != 0) {
                        check = false;
                        break;
                    }
                }
                if(divide == 2 && check) {
                    break;
                }
            }
            
            if(divide > 3) {
                divide = 3;
            }

            if(check) {
                for(int i =0; i< arr.length; i++) {
                    arr[i] /= divide;
                }
                answer *= divide;

            }

            if(!check && divide == 3) {
                for(int i =0; i< arr.length; i++) {
                    answer *= arr[i];
                }
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{100,100}));
    }
}
