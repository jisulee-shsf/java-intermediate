package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer integer = 10;

        Object object = GenericMethod.objectMethod(integer);
//        Integer result = (Integer) GenericMethod.objectMethod(integer);

        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(integer);
        Integer integerValue = GenericMethod.<Integer>numberMethod(integer);
        Double doubleValue = GenericMethod.<Double>numberMethod(10.0);

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(integer);
        Integer integerValue2 = GenericMethod.numberMethod(integer);
        Double doubleValue2 = GenericMethod.numberMethod(10.0);

        System.out.println("타입 매개변수 제한");
        String string = GenericMethod.<String>genericMethod("hello");
//        GenericMethod.<String>numberMethod("hello");
    }
}
