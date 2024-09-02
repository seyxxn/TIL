package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] split = str.split(",");
        for (String string : split) {
            System.out.println(string);
        }

        // join()을 쓰지 않으면 매우 복잡함
        String joinStr = "";
        for(int i = 0; i < split.length; i++){
            String string = split[i];
            joinStr += string;
            if (i != split.length-1){
                joinStr += "-";
            }
        }

        System.out.println("joinStr = " + joinStr);

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", split);
        System.out.println("result = " + result);

    }
}
