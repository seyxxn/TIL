package pack;

import pack.a.User;

// 클래스 이름이 모두 User로 동일한 경우 어떻게 사용 ?
public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // b는 직접 다 작성해줘야

        // 같은 이름의 클래스가 있다면, import는 하나만 선택할 수 있음
        // 이때는 자주쓰는 클래스를 import로 하고
        // 나머지는 패키지를 포함한 전체 경로로 적어줌

        // 둘다 전체 경로 적어도 ok
    }
}
