package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("student1", 90);
        studentMap.put("student2", 80);
        studentMap.put("student3", 80);
        studentMap.put("student4", 100);

        Integer result = studentMap.get("student1");
        System.out.println(result); // 90

        Set<String> keys = studentMap.keySet();
        for (String key : keys) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
        /*
        key = student2, value = 80
        key = student1, value = 90
        key = student4, value = 100
        key = student3, value = 80
        */

        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
        /*
        value = 80
        value = 90
        value = 100
        value = 80
        */

        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
        /*
        key = student2, value = 80
        key = student1, value = 90
        key = student4, value = 100
        key = student3, value = 80
        */
    }
}
