package programmers.LV2;

import java.util.Arrays;

public class 이진_변환_반복하기 {
  public static int[] solution(String s) {
    int[] answer = {0,0};
    int count = 0;
    int count0replace = 0;

    while (!s.equals("1")) {
      int replaceLength = s.replaceAll("0", "").length();
      count0replace += s.length() - s.replaceAll("0", "").length();
      count ++;

      s = Integer.toBinaryString(replaceLength);
    }

    answer[0] = count;
    answer[1] = count0replace;
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.equals(solution("110010101001"), new int[]{3, 8}));
  }
}
