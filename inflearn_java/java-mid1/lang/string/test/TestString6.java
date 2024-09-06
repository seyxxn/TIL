package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key); // 일단 첫번째 key 인덱스

        // 왜 index >= 0인가 ?
        // key를 못찾으면 -1이 나오기 때문에
        // 있는 단어를 치면 양수가 나오기 때문이다
        while(index >= 0){
            index = str.indexOf(key, index+1);
            // fromIndex(두번째인자): 어디서부터 찾을것인가 ?
            // 찾은 그 다음부터 보면되기 때문에 index + 1을 함
            count++;
        }
        System.out.println("count = " + count);
    }
}
