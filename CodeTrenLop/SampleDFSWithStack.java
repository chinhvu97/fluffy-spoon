import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class SampleDFSWithStack
{
    public static void main(String[] args) {
        int[][] g = {   { 0, 1, 0, 0, 0, 0, 0}, 
                            { 1, 0, 1, 1, 1, 0, 0},
                            { 0, 1, 0, 0, 0, 1, 0},
                            { 0, 1, 0, 0, 0, 1, 1},
                            { 0, 1, 0, 0, 0, 0, 1},
                            { 0, 0, 1, 1, 0, 0, 0},
                            { 0, 0, 0, 1, 1, 0, 0}};
        // Dinh: 0,1,2,3,4,5,6
        Stack<Integer> myStack = new Stack<>();
        Set<Integer> setDinhDaDuyet = new HashSet<>();

        int dinhBatDau = 0;
        myStack.add(dinhBatDau);
        setDinhDaDuyet.add(dinhBatDau);

        while(myStack.isEmpty() == false){
            int u = myStack.pop();
            // process u:
            System.out.print(u + " ");
            for (int v = 0; v < g.length; v++) {
                if(g[u][v] == 1 &&  setDinhDaDuyet.contains(v) == false ){
                    setDinhDaDuyet.add(v);
                    myStack.add(v);
                }
            }
        }
    }
}