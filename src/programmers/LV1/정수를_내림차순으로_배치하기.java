package programmers.LV1;

import java.util.Arrays;

public class 정수를_내림차순으로_배치하기 {
  public static long solution(long n) {
    long answer = 0;
    String nStr = String.valueOf(n);

    int index = nStr.length() - 1;
    int count = 0;
    for (int i = 9; i >= 0; i--) {
      count = nStr.length() - nStr.replace(String.valueOf(i), "").length();

      for (int j = 0; j < count; j++) {
        answer += i * Math.pow(10L, index);
        index--;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(118372) == 873211);
  }
}
