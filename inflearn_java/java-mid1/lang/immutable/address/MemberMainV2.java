package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA); // 서울
        System.out.println("memberB = " + memberB); // 서울

        // 회원B의 주소를 부산으로 변경해야 함
        // memberB.getAddress().setValue("부산"); // 컴파일 에러발생 -> 불변객체기 때문
        memberB.setAddress(new ImmutableAddress("부산")); // ImmutableAddress를 새로 만들었음
        // ImmutableAddress 자체가 불변, memberB(MemberV2)는 불변이 아님 ! (주의)

        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA); // 서울
        System.out.println("memberB = " + memberB); // 부산
    }
}
