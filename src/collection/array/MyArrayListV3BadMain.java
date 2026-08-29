package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자 입력 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자"); // 문자 입력 허용
        System.out.println(numberList); // [1, 2, 문자] size=3 capacity=5

        // Object 반환 -> 다운 캐스팅 필요
        Object object = numberList.get(0);
        Integer integer1 = (Integer) numberList.get(0);
        Integer integer2 = (Integer) numberList.get(1);
        Integer integer3 = (Integer) numberList.get(2); // ClassCastException
    }
}
