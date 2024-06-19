package programmers.LV0;

public class 글자_이어_붙여_문자열_만들기 {
  public static String solution(String my_string, int[] index_list) {
    StringBuilder answer = new StringBuilder();
    char[] chars = my_string.toCharArray();

    for(int index : index_list) {
      answer.append(chars[index]);
    }

    return answer.toString();
  }

  public static void main(String[] args) {
    System.out.println(solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}).equals("programmers"));
  }
}
