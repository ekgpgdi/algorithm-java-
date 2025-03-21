package programmers.LV3;

public class 스티커_모으기_2 {
    /*
        원형 배열에서 n 개를 선택한 최댓값 구하기
        단, 하나를 선택했을 때 좌우측은 선택할 수 없다.

        = DP 방식으로 첫번째 스티커를 선택했을 때, 선택하지 않고 두번째 스티커를 선택했을때를 구해야 함

        dp1[i]는 첫 번째 스티커를 선택했을 때, i번째 스티커까지 고려했을 때의 최대 합을 저장
        첫 번째 스티커를 선택했으므로, 마지막 스티커는 선택할 수 없습니다. 따라서 dp1 배열은 sticker.length - 1까지만 계산
        dp1[i]는 dp1[i-1](현재 스티커를 선택하지 않는 경우)와 dp1[i-2] + sticker[i](현재 스티커를 선택하는 경우) 중 큰 값을 선택
   */
    public static int solution(int[] sticker) {
        if (sticker.length == 1) return sticker[0];

        int[] dp1 = new int[sticker.length]; // 첫번째 스티커를 선택했을 때
        int[] dp2 = new int[sticker.length]; // 첫번째의 스티커를 선택하지 않았을 때

        dp1[0] = sticker[0];
        dp1[1] = sticker[0];

        for (int i = 2; i < sticker.length - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + sticker[i]);
        }

        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int i = 2; i < sticker.length; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + sticker[i]);
        }

        return Math.max(dp1[sticker.length - 2], dp2[sticker.length - 1]);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{14, 6, 5, 11, 3, 9, 2, 10}));
    }
}
