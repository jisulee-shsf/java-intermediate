package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap); // {studentA=90}

        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap); // {studentA=90}

        studentMap.putIfAbsent("studentA", 50);
        studentMap.putIfAbsent("studentB", 50);
        System.out.println(studentMap); // {studentB=50, studentA=90}
    }
}
