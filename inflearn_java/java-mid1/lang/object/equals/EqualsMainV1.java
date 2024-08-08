package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        // false 출력
        // 동등성을 비교하는 ==을 사용함 -> 객체가 물리적으로 다르기 때문에 같지 않음

        System.out.println("equality = " + (user1.equals(user2)));
        // false 출력 **
        // 동일성을 비교. 논리적으로 같은지를 비교하는 것인데 왜 false가 출력될까?
        // Object가 기본으로 제공하는 equals() 메서드에서는 ==으로 비교하기 때문에
        // false가 출력됨

    }
}
