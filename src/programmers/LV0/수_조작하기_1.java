package programmers.LV0;

import java.util.Objects;

public class 수_조작하기_1 {
  public static int solution(int n, String control) {
    char[] chars = control.toCharArray();

    for (char c : chars) {
      if (c == 'w') {
        n++;
      } else if (c == 's') {
        n--;
      } else if (c == 'd') {
        n += 10;
      } else if (c == 'a') {
        n -= 10;
      }
    }

    return n;
  }

  public static void main(String[] args) {
    System.out.println(solution(0, "wsdawsdassw") == -1);
  }
}
