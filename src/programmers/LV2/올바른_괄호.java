package programmers.LV2;

public class 올바른_괄호 {
  public static boolean solution(String s) {
    String[] splitS = s.split("");

    int check = 0;
    for (int i = 0; i < s.length(); i++) {
      if(splitS[i].equals("(")) {
        check ++;
      } else {
        check --;
      }

      if(check < 0) {
        return false;
      }
    }

    return check == 0;
  }

  public static void main(String[] args) {
    System.out.println(solution("()()"));
  }
}
