package collection.set;

public class StringHashMain {

    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        System.out.println((int) 'A'); // 65
        System.out.println((int) 'B'); // 66

        System.out.println(hashIndex(hashCode("A"))); // 5
        System.out.println(hashIndex(hashCode("B"))); // 6
        System.out.println(hashIndex(hashCode("AB"))); // 1
    }

    private static int hashCode(String string) {
        char[] charArray = string.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
