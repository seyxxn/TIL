package access.a;

// 하나의 자바 파일에 public 클래스는 하나만 등장 가능 (이건 파일명과 이름이 같아야함)
// 하나의 자바 파일에 default 접근 제어자를 사용하는 클래스는 무한으로 만들 수 있음

public class PublicClass { // public 클래스라서 파일명과 이름이 같아야함
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

// default는 같은 패키지 내에서만 접근 가능
class DefaultClass1 {

}

class DefaultClass2 {

}