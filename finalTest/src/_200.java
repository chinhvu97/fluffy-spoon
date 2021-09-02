import java.util.*;

public class _200 {
    public static void runDFS(int dinhDangXet, Set<Integer> setDinhDaDuyet, char[][] g) {
        // process u:
//        System.out.print(dinhDangXet + " ");
//        result.add(dinhDangXet);
        for (int v = 0; v < g.length; v++) {
            if (g[dinhDangXet][v] == '1' && !setDinhDaDuyet.contains(v)) {
                setDinhDaDuyet.add(v);
//                result.add(v);
                runDFS(v, setDinhDaDuyet, g);
            }
        }
    }

    public static int numIslands(char[][] grid) {
        List<Set<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            Set<Integer> islands = new TreeSet<>();
//            TreeSet<Integer> result = new TreeSet<>();
            runDFS(i, islands, grid);
//            System.out.println(i + " " + islands);
            if (!myList.contains(islands) && !islands.isEmpty()) {
                myList.add(islands);
            }
        }
        return myList.size();
    }

    public static void main(String[] args) {
        char[][] g = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        // Dinh: 0,1,2,3,4,5,6
        System.out.println(numIslands(g)); ;
    }
}