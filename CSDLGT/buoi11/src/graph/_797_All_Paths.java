package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class _797_All_Paths {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        if (graph.length == 0) return result;

        List<Integer> path = new ArrayList<>();
        path.add(0);
        findPath(graph, 0, path, result);
        return result;
    }

    private static void findPath(int[][] graph, int current, List<Integer> path, List<List<Integer>> result) {
        if (current == graph.length - 1) { //current is index in graph of sublist
            result.add(new ArrayList<>(path)); //reach end -> add path to result
            return;
        }
        for (int i : graph[current]) { //traversing sublist and finding path from that again
            path.add(i);
            findPath(graph, i, path, result);
            path.remove(path.size() - 1);//backtracking -> modify new path: {0}
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        allPathsSourceTarget(graph);
    }
}
