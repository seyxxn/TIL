package generic.ex1;

public class GenericBox<T> {
    // 제네릭클래스는 타입을 미리 결정하지 않음
    // T : 타입 매개변수
    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
