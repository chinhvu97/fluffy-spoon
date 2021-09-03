import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * TestSet
 */
public class TestSet {

    private static class Student {
        public int id;
        public String name;
        public Student(int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            Student other = (Student)obj;
            return this.id == other.id;
        }

        @Override
        public int hashCode() {
            return this.id;
        }
    }

    public static void main(String[] args) {
        Set<Student> mySet = new HashSet<>();

        Student s1 = new Student(10, "Jim");
        Student s2 = new Student(10, "Jack");

        mySet.add(s1);

        System.out.println("mySet.contains(s1): " + mySet.contains(s1));
        System.out.println("mySet.contains(s2): " + mySet.contains(s2));

    }
}