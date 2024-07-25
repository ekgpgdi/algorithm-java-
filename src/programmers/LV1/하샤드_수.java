package programmers.LV1;

public class 하샤드_수 {
  public static boolean solution(int x) {
    int sum = 0;
    int copyX = x;

    while (copyX > 0) {
      sum += copyX % 10;
      copyX /= 10;
    }

    return ((double) x) / sum == x / sum;
  }

  public static void main(String[] args) {
    System.out.println(!solution(11));
  }
}
