import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSByRecursion {

    public static void runDFS(int dinhDangXet, Set<Integer> setDinhDaDuyet, int[][] g) {
        // process u:
        System.out.print(dinhDangXet + " ");
        for (int v = g.length-1; v >= 0; v--) {
            if (g[dinhDangXet][v] == 1 && setDinhDaDuyet.contains(v) == false) {
                setDinhDaDuyet.add(v);
                runDFS(v, setDinhDaDuyet, g);
            }
        }
    }

    public static void main(String[] args) {
        int[][] g = { { 0, 1, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 1, 0, 0 }, { 0, 1, 0, 0, 0, 1, 0 },
                { 0, 1, 0, 0, 0, 1, 1 }, { 0, 1, 0, 0, 0, 0, 1 }, { 0, 0, 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1, 0, 0 } };

        // Dinh: 0,1,2,3,4,5,6
        Set<Integer> setDinhDaDuyet = new HashSet<>();

        int dinhBatDau = 0;
        setDinhDaDuyet.add(dinhBatDau);
        runDFS(dinhBatDau, setDinhDaDuyet, g);
    }
}
