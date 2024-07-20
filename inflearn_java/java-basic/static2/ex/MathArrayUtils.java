package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils(){
        // 생성자를 private으로 해서
        // 인스턴스 생성을 막음
    }

    public static int sum(int[] values){
        int sum = 0;
        for(int num : values){
            sum += num;
        }
        return sum;
    }

    public static double average(int[] values){
        return (double) sum(values)/values.length;
    }

    public static int min(int[] values){
        int min = values[0];
        for(int num : values){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    public static int max(int[] values){
        int max = values[0];
        for(int num : values){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
}
