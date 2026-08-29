package generic.test.ex3;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T bioUnit = shuttle.out();
        System.out.println("1bioUnit.getClass().getName() = " + bioUnit.getClass().getName());
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit bioUnit = shuttle.out();
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }
}
