package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    // equals() 메서드를 재정의 했다
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;
        // 다운 캐스팅 필요 (Object 타입에는 id가 없기 때문에)**
        return id.equals(user.id); // id가 같은지 확인
        // 나의 id와 인자로 넘어온 객체의 id가 같은가?
        // 문자열 비교는 equals()를 사용해야 함
    }
    */

    // command + n 단축키로 생성한 equals 메서드
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
}