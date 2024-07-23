package programmers.LV1;

public class 정수_제곱근_판별 {
  public static long solution(long n) {
    double sqrt = Math.sqrt(n);

    if(sqrt != Math.round(sqrt)) {
      return -1;
    }

    return (long) Math.pow(sqrt + 1, 2);
  }

  public static void main(String[] args) {
    System.out.println(solution(121) == 144);
  }
}
