package programmers.LV0;

import java.util.Objects;

public class 로그인_성공 {
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (int i = 0; i < db.length; i++) {
            if (Objects.equals(db[i][0], id_pw[0]) && Objects.equals(db[i][1], id_pw[1])) {
                return "login";
            } else if (Objects.equals(db[i][0], id_pw[0])) {
                answer = "wrong pw";
            }
        }

        if (answer.equals("")) {
            answer = "fail";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Objects.equals(solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}), "login"));
    }
}
