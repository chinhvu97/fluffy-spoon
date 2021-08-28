package graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _1791_Center_Graph {
    public static int findCenter(int[][] edges) {
        int n = edges.length;
        int[] counts = new int[n + 2];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            counts[u]++;
            counts[v]++;

            if (counts[u] == n) return u;
            if (counts[v] == n) return v;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{4,2}};
        System.out.println(findCenter(edges));
    }

}
