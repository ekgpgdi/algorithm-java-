package programmers.LV2;

public class 다음_큰_숫자 {
  public static int solution(int n) {
    int count = Integer.bitCount(n); // 2진수에서 1의 개수
    int answer = n + 1;

    while(true) {
      if(count == Integer.bitCount(answer)) {
        break;
      }
      answer ++;
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(78) == 83);
  }
}
