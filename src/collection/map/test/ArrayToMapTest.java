package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }

        Set<String> products = productMap.keySet();
        for (String product : products) {
            System.out.println(product + " = " + productMap.get(product));
        }
        /*
        Java = 10000
        JPA = 30000
        Spring = 20000
        */
    }
}
