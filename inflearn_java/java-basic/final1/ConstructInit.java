package final1;

public class ConstructInit {
    final int value; // final을 필드에 사용한 경우

    // 이 경우에서는 생성자로 값을 넣어줘야함
    public ConstructInit(int value){
        this.value = value;
    }
}
