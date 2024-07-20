package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count= " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count= " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count= " + data3.count);

        // 모두 count가 1로 출력됨
        // 객체 생성할 때 마다 인스턴스가 새로 생성되기 때문에 당연히 모두 1로 됨

        // 즉, count 값은 인스턴스끼리 서로 공유되지 않음
    }
}
