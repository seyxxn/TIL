package generic.test.ex3;

public class Shuttle<T extends BioUnit> {
    private T t;


    public void in(T t) {
        this.t = t;
    }

    public void showInfo() {
        System.out.println("이름: " + t.getName() + ", HP: " + t.getHp());
    }

    public T out(){
        return t;
    }
}
