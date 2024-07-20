package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    // 지바 관례 - static final이 붙으면 대문자로
    final int value = 10; // 초기값을 이미 넣어버림
    // -> 이 경우 생성자에서도 값을 넣어줄 수 없음

//    public FieldInit(int value){
//        this.value = value;
//    }
}
