package programmers.LV2;

public class JadenCase_문자열_만들기 {

  public static String solution(String s) {
    char[] split = s.toCharArray();
    split[0] = Character.toUpperCase(split[0]);

    for(int i =1; i< split.length;i++) {
      if(split[i-1] == ' ') {
        split[i] = Character.toUpperCase(split[i]);
      } else {
        split[i] = Character.toLowerCase(split[i]);
      }
    }

    return String.copyValueOf(split);
  }

  public static void main(String[] args) {
    System.out.println(solution("3people unFollowed me").equals("3people Unfollowed Me"));
  }
}
