package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));
        // 동일성은 여전히 false
        System.out.println("equality = " + user1.equals(user2));
        // 동등성은 equals() 메소드를 재정의했기 때문에
        // id가 같으므로 true가 출력
    }
}
