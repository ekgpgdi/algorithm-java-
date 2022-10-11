package programmers.LV0;

public class 개미_군단 {

    public static int solution(int hp) {
        int answer = 0;
        int warlord = 5; // 장군 개미
        int soldier = 3; // 병정 개미
        int ergate = 1; // 일 개미

        if (hp / warlord > 0) {
            answer += hp / warlord;
            hp -= (hp / warlord) * warlord;
        }

        if (hp / soldier > 0) {
            answer += hp / soldier;
            hp -= (hp / soldier) * soldier;
        }

        answer += hp / ergate;

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(23) == 5);
    }
}
