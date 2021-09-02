import java.util.*;

public class _609 {

    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> fileList = new ArrayList<>();
        HashMap<String, Integer> occurences = new HashMap<>();
       for (String path : paths) {
           String[] rootAndFiles = path.split(" ");
           for (int i = 1; i < rootAndFiles.length; i++) {
               List<String> splitContent = new ArrayList<>();
               String[] split = rootAndFiles[i].split("\\(");
               splitContent.add(rootAndFiles[0] + "/" + split[0]);
               splitContent.add(split[1]);

               occurences.put(split[1], occurences.getOrDefault(split[1], 0) +1);
               fileList.add(splitContent);
           }
       }
        List<List<String>> results = new ArrayList<>();
        Set<String> keys = occurences.keySet();
        for (String key : keys) {
            if (occurences.get(key) > 1) {
                List<String> result = new ArrayList<>();
                for (var file : fileList) {
                    if (Objects.equals(file.get(1), key)) {
                        result.add(file.get(0));
                    }
                }
                results.add(result);
            }
        }
       return results;
    }

    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        findDuplicate(paths);
    }
}
