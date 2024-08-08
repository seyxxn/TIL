package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA); // 서울
        System.out.println("memberB = " + memberB); // 서울

        // 회원B의 주소를 부산으로 변경해야 함
        memberB.getAddress().setValue("부산"); // 문제가 되는 부분

        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA); // 부산
        System.out.println("memberB = " + memberB); // 부산
        // B의 주소만 바꿨는데 A와 B모두 부산으로 바뀜 !! (사이드 이펙트)
        // 왜? 회원A와 회원B가 같은 Address 인스턴스를 참조하고 있기 때문이다


    }
}
