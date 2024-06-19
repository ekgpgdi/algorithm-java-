package programmers.LV0;

public class 문자열_뒤의_n글자 {
  public static String solution(String my_string, int n) {
    return my_string.substring(my_string.length() - n);
  }

  public static void main(String[] args) {
    System.out.println(solution("ProgrammerS123", 11).equals("grammerS123"));
  }
}
