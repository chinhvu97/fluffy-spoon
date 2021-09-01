import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1436 {
    public static String destCity(List<List<String>> paths) {
        Set<String> starts = new HashSet<>();

        for (List<String> city : paths) {
            starts.add(city.get(0));

        }
        for (List<String> city : paths) {
            if (!starts.contains(city.get(1))) {
               return   city.get(1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        List<String> path1 = List.of(new String[]{"London", "New York"});
        List<String> path2 = List.of(new String[]{"New York","Lima"});
        List<String> path3 = List.of(new String[]{"Lima","Sao Paulo"});
        List<List<String>> paths = new ArrayList<>();
        paths.add(path1);
        paths.add(path2);
        paths.add(path3);
        System.out.println(destCity(paths));
    }
}
