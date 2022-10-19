package programmers.LV0;

public class 외계어_사전 {
    public static int solution(String[] spell, String[] dic) {
        String tmp_spell;
        String str_spell = String.join("", spell);

        for (int i = 0; i < dic.length; i++) {
            tmp_spell = String.join("", spell);
            for (int j = 0; j < str_spell.length(); j++) {
                if(dic[i].contains(String.valueOf(str_spell.charAt(j)))) {
                    tmp_spell = tmp_spell.replace(String.valueOf(str_spell.charAt(j)), "");
                }
                dic[i] = dic[i].replace(String.valueOf(str_spell.charAt(j)), "");
            }

            if (dic[i].length() == 0 && tmp_spell.length() == 0) {
                return 1;
            }
        }

        return 2;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}) == 2);
    }
}
