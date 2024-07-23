package programmers.LV1;

public class 문자열을_정수로_바꾸기 {
  public static int solution(String s) {
    int type = 1;

    if (s.contains("-")) {
      type = -1;
      s = s.replace("-", "");
    }

    return Integer.parseInt(s) * type;
  }

  public static void main(String[] args) {
    System.out.println(solution("1234") == 1234);
  }
}
