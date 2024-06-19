package programmers.LV0;

public class 접미사인지_확인하기 {
  public static int solution(String my_string, String is_suffix) {
    for (int i = 0; i < my_string.length(); i++) {
      if (is_suffix.equals(my_string.substring(i))) {
        return 1;
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    System.out.println(solution("banana", "ana") == 1);
  }
}
