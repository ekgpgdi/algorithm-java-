package programmers.LV2;

public class 숫자의_표현 {
  public static int solution(int n) {
    int answer = 0;
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum = 0;
      for (int j = i; sum <= n && j <= n; j++) {
        sum += j;
        if (sum == n) {
          answer++;
          break;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(15) == 4);
  }
}
