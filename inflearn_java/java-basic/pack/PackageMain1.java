package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        // PackageMain1과 Data는 같은 pack 패키지에 존재
        pack.a.User user = new pack.a.User();
        // PackageMain1과 User는 서로 다른 패키지에 존재
        // 다른 패키지면 전체 경로를 포함해서 클래스를 적어야 함

    }
}
