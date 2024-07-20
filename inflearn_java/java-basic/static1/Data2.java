package static1;

public class Data2 {
    public String name;
    // count 멤버 변수를 선언하는 대신 생성자에서 Counter 인스턴스를 추가로 전달받을 것이다

    public Data2(String name, Counter counter){
        this.name = name;
        counter.count++;
    }
}
