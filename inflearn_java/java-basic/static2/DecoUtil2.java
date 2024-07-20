package static2;

public class DecoUtil2 {

    // 메서드에 Static을 붙여주었음
    // -> 정적 메서드가 됨
    // -> 정적 메서드처럼 인스턴스 생성없이 클래스 명을 통해 호출 가능
    public static String deco(String str){
        String result = "*" + str + "*";
        return result;
    }

}
