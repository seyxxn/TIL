package pack; // 코드의 첫줄에는 package
// 그 다음줄 부터는 import 사용 가능
import pack.a.*; // pack.a의 모든 클래스를 사용할 수 있음(*)

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        // import 문 사용으로 패키지 명을 생략
    }
}
