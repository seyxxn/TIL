package access.ex;

public class MaxCounter {

    // 데이터는 모두 private
    private int count = 0;
    private int max;

    // 생성자
    public MaxCounter(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void increment(){
        if (isMax()){
            System.out.println("최대값을 초과할 수 없습니다.");
        } else{
            this.count++;
        }
    }

    // 이건 내부에서만 사용하면 되니까 priavte
    private boolean isMax(){
        return count >= max;
    }
}
