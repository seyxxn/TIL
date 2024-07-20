package static1;

import memory.Data;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // Data3.count (접근 방식이 이전과는 조금 다름) (클래스명.변수명)
        // 클래스에 직접 접근했다

        // static은 메서드 영역에서 관리함
        // static이 붙은 멤버 변수 count는 인스턴스 영역에 생성되지 않음

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 이 방법은 추천하지 않음 (마치 인스턴스 변수에 접근하는 것 처럼 오해할 수 있음)

        // 클래스를 통한 접근
        System.out.println(Data3.count);

        // 둘 다 정적 변수에 접근함
    }
}
