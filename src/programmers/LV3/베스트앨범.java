package programmers.LV3;

import java.util.*;

class G implements Comparable<G> {
    int index;
    int playCount;

    public G(int index, int playCount) {
        this.index = index;
        this.playCount = playCount;
    }

    @Override
    public int compareTo(G ob) {
        if (ob.playCount != this.playCount) return ob.playCount - this.playCount;

        return this.index - ob.index;
    }
}

public class 베스트앨범 {

    /*
        1부터 시작해서 네트워크 연결하고 체크 배열로 연결 안된 추가 네트워크 찾아다니기
     */
    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> H = new HashMap<>();
        HashMap<String, ArrayList<G>> GList = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (H.containsKey(genres[i])) {
                H.put(genres[i], H.get(genres[i]) + plays[i]);
                ArrayList<G> a = GList.get(genres[i]);
                a.add(new G(i, plays[i]));
                GList.put(genres[i], a);
            } else {
                H.put(genres[i], plays[i]);
                ArrayList<G> a = new ArrayList<>();
                a.add(new G(i, plays[i]));
                GList.put(genres[i], a);
            }
        }

        ArrayList<String> Hkey = new ArrayList<>(H.keySet());
        Hkey.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return H.get(o2).compareTo(H.get(o1));
            }
        });

        ArrayList<Integer> answerList = new ArrayList<>();
        for (String K : Hkey) {
            ArrayList<G> a = GList.get(K);
            Collections.sort(a);

            for (int i = 0; i < Math.min(2, a.size()); i++) {
                answerList.add(a.get(i).index);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
