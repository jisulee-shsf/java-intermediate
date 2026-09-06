package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap); // {studentA=90}
        studentMap.put("studentA", 100);
        System.out.println(studentMap); // {studentA=100}

        boolean result = studentMap.containsKey("studentA");
        System.out.println(result); // true

        studentMap.remove("studentA");
        System.out.println(studentMap); // {}
    }
}
