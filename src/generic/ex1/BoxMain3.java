package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.set(10);
//        integerGenericBox.set("string");
        Integer integer = integerGenericBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("string");
//        stringGenericBox.set(10);
        String string = stringGenericBox.get();
        System.out.println("string = " + string);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(10.5);
        Double doubleValue = doubleGenericBox.get();
        System.out.println("doubleValue = " + doubleValue);
    }
}
