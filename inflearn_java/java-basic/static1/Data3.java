package static1;


public class Data3 {
    public String name;
    public static int count; // static
    // static 변수 = 정적 변수 = 클래스 변수
    // 공용으로 함께 사용하는 변수 선언

    public Data3(String name){
        this.name = name;
        count++;

        // Data3.count++; // 이렇게 쓸수도 있음
        // static이면 클래스 명 생략가능
    }
}
