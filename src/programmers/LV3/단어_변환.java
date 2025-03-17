package programmers.LV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 단어_변환 {
    static int answer = 0;
    /*
        한번에 알파벳 하나만 바꿔서 begin -> target 으로 가는 횟수
        바꿀 때 word 에 있는 단어로만 변환 가능
     */
    public static int solution(String begin, String target, String[] words) {
        dfs(begin, target, words, 0, new boolean[words.length]);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt, boolean[] ch) {
        if(begin.equals(target)) {
            answer = cnt;
            return;
        }

        for(int i = 0; i < words.length; i++) {
            if(ch[i]) continue;

            if(ch(begin, words[i])) {
                ch[i] = true;
                dfs(words[i], target, words, cnt + 1, ch);
                ch[i] = false;
            }
        }

    }

    public static boolean ch(String a, String b) {
        int missCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) missCount++;

            if (missCount >= 2) return false;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
    }
}
