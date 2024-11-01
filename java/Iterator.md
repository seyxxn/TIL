# Iterator
Iterator란 자바의 컬렉션(Collection)에 저장되어 있는 요소들을 순회하는 인터페이스
- 반복자라고도 하며, 간단하게 말하면 연결리스트와 별도로 자유 자재로 값을 순회할 수 있는 별도의 친구 !

## Collection?
자바에서 제공하는 자료구조들의 인터페이스로 List, ArrayList, Stack, Queue, LinkedList 등이 이를 상속받고 있음
- 즉, 이러한 컬렉션 인터페이스를 상속받는 클래스들에 대해 Iterator 인터페이스 사용이 가능함

## 사용방법
- 정의 방법
    - `Iterator<T> iterator = Collenction.iterator()`
- 메서드
    - `hasNext()` : 다음 요소가 있는지 판단함
    - `next()` : 다음 요소를 가져옴
    - `remove()` : 가져온 요소를 삭제함

```java
public class IteratorTest {
 
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
 
        for(int i = 0;i <= 100; i++) {
            list.add(i);
        }
        
        Iterator<Integer> iter = list.iterator(); // 정의
        
        while(iter.hasNext()) { // 값이 없을 때까지 반복
            int data = iter.next(); // 다음 요소로 이동
            System.out.print(data); // 데이터 출력
        }
        
    }
    
}
```

## 메서드 - hasNext()
- 읽어올 객체가 남아있으면 true, 없으면 false 반환

## 메서드 - next()
- 컬렉션에서 하나의 객체를 읽어옴
- 호출하기 전에 `hasNext()`로 읽어올 다음 요소가 있는지 먼저 확인하는 것이 좋음

## 메서드 - remove()
- `next()`를 통해 읽어온 객체를 삭제함
- `next()` 호출 다음 `remove()`를 사용해야함

### 문제
- Iterator는 연결리스트 내의 노드를 가리키는 역할을 함
- Iterator 사용 유무와 관계없이, 위치를 찾는 과정을 제외한 삽입/삭제 연산 자체에 걸리는 시간은 `O(1)`로 동일함
- Iterator는 삽입, 삭제, 탐색 연산에 모두 쓰일 수 있음
- Iterator를 사용하면 중간에 있는 값들을 반복해서 탐색하는 코드를 효율적으로 작성하는 것이 가능함
- 단일 연결리스트, 이중 연결리스트는 연결 방식에 차이가 있을 뿐 모두 Iterator 사용이 가능함. 다만, next로만 연결된 단일 연결 리스트에서는 lterator.prev를 지정할 수는 없음
- 연결 리스트에서 Iterator를 사용하더라도 처음에 k번째 위치를 찾기 위해서는 `O(N)`의 시간이 필요함