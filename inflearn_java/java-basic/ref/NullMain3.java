package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        // 참조형이라서 NULL로 초기화 되어있음

        // NULL로 초기화 된 참조값을 찾아가니까 오류가 발생
        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
