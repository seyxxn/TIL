
# useDelimiter() 메서드
Scanner 클래스의 useDelimiter 메서드로 **구분자를 사이에 두고 문자를 입력받을 수 있다**

```java
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":"); // : 를 기분으로 잘라서 입력 받겠다
        int a = sc.nextInt(); // : 기호가 나오기 전까지 입력 진행
        int b = sc.nextInt(); // : 기호가 나오기 전 or 입력의 마지막 문자까지 진행

        System.out.println(a);
        System.out.println(b);
    }
}
```
- 입력을 `10:20` 이렇게 받으면, `a = 10, b = 20` 으로 잘라서 입력 받음


#### 🔎 참고한 글
[자바 - Scanner(System.in) 특정 문자를 사이에 두고 입력받기](https://ha1fm00n.tistory.com/62)
[[Java 공부]Scanner 클래스의 useDelimiter 메소드를 이용해서 구분자를 쉼표로 변경해보기](https://cinnamonc.tistory.com/260)