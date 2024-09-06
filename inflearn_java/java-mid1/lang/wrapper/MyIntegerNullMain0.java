package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // 찾지 못함 -> -1 반환함
        // 이 경우 -1를 target으로 했을 때와 같은 결과가 출력되어 명확하지 않은 결과가 나옴
    }

    // 배열에 찾는 값이 있으면 해당 값을 반환, 없으면 -1 반환
    private static int findValue(int [] intArr, int target){
        for (int value: intArr) {
            if (value == target){
                return value;
            }
        }
        return -1; // 찾지 못한 경우 -1 반환
    }
}
