package generic.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param){
//        return param instanceof T; // 오류
        return false;
    }

    public void create(){
//        return new T(); // 오류
    }
}

// 타입이레이저
// 제네릭은 컴파일 시점에서만 존재하며,
// 런타임 시에는 제네릭 정보를 지움 ..
// 그래서 타입을 이용한 코드들은 사용할 수 없음 -> 오류가 발생함