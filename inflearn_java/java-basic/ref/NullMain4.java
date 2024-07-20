package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 참조 값을 넣어주면 에러가 발생하지 않는다

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        // 참조형이라서 NULL로 초기화 되어있음

        // (참조 값 넣어주기 전에는) NULL로 초기화 된 참조값을 찾아가니까 오류가 발생
        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
