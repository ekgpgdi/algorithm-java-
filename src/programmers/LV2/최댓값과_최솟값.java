package programmers.LV2;

public class 최댓값과_최솟값 {
  public static String solution(String s) {
    String[] splitS = s.split(" ");

    int min = Integer.parseInt(splitS[0]);
    int max = Integer.parseInt(splitS[0]);

    for (int i = 1; i < splitS.length; i++) {
      if (min > Integer.parseInt(splitS[i])) {
        min = Integer.parseInt(splitS[i]);
      }

      if (max < Integer.parseInt(splitS[i])) {
        max = Integer.parseInt(splitS[i]);
      }
    }

    return min + " " + max;
  }

  public static void main(String[] args) {
    System.out.println(solution("1 2 3 4").equals("1 4"));
  }
}
