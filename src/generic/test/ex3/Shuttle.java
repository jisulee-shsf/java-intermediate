package generic.test.ex3;

public class Shuttle<T extends BioUnit> {
    private T bioUnit;

    public void in(T t) {
        bioUnit = t;
    }

    public T out() {
        return bioUnit;
    }

    public void showInfo() {
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }
}
