package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _997_Town_Judge {
    public static int findJudge(int n, int[][] trust) {
        //init
        List<Set<Integer>> relations = new ArrayList<>(n);
        for (int i = 0 ; i <= n; i++ ) {
            relations.add(new HashSet<>());
        }

        //add relation to set
        for (int[] trustOther : trust) {
            Set<Integer> cur = relations.get(trustOther[0]);
            cur.add(trustOther[1]);
        }


        int guyWhoTrustNoOne = -1;
        for (int guy = 1; guy < relations.size(); guy++) {
            if (relations.get(guy).size() == 0) {
                guyWhoTrustNoOne = guy;
                break;
            }
        }

        boolean isTrustedByEveryone = true;
        for (int guy = 1; guy < relations.size();guy++) {
            if (!relations.get(guy).contains(guyWhoTrustNoOne) && guy != guyWhoTrustNoOne) {
                isTrustedByEveryone = false;
                break;
            }
        }

        if (isTrustedByEveryone) return guyWhoTrustNoOne;
        return -1;
    }

    public static void main(String[] args) {
        int[][] trust = {{1,2}};
        System.out.println(findJudge(2, trust));
    }
}
