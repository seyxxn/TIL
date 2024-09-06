package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    public static int[] lotto = new int[6]; // 로또 번호를 저장할 배열
    public static  int cnt = 0; // 로또 갯수

    public static void main(String[] args) {
        // 로또 번호를 자동으로 만들어주는 자동 생성기
        // 로또 번호는 1-45 사이의 6개 숫자
        // 각 숫자는 중복되면 X, 실행할 때 마다 결과가 달라야 함
        Random random = new Random();

        while(cnt < 6){
            int n = random.nextInt(45) + 1; // 1-45 사이의 숫자
            if (isUnique(n)){
                lotto[cnt] = n;
                cnt++;
            }
        }

        System.out.print("로또 번호: ");
        for(int i = 0; i < 6; i++){
            System.out.print(lotto[i] + " ");
        }
    }

    // 지금까지 저장된 숫자들 중 중복되는 숫자가 있는지 검사하는 함수
    public static boolean isUnique(int num){
        for(int i = 0; i < cnt; i++){
            if (lotto[i] == num){
                return false;
            }
        }
        return true;
    }
}
