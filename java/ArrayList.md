# ArrayList
## ArrayList란?
- 동적 배열 (즉, 확장 가능한 배열 resizable array)
- 크기가 고정되어있는 배열과 달리 데이터 적재량에 따라 가변적으로 공간을 늘리거나 줄임

### ArrayList vs 배열
#### 배열
- 처음 선언한 배열의 크기는 변경할 수 없음 (정적 할당)
- 하나의 데이터를 삭제하더라도 해당 index에는 빈 공간으로 계속 남음

#### ArrayList
- 리스트의 길이가 가변적임 (동적 할당)
- 데이터 사이에 빈 공간을 허용하지 않음

## import문
```java
import java.util.ArrayList;
```

## 객체 생성
| 메서드 | 설명 |
| ---- | ---- |
| ArrayList() | 크기가 10인 ArrayList를 생성 | 
| ArrayList(Collection c) | 주어진 컬렉션이 저장된 ArrayList를 생성 |
| ArrayList(int initialCapacity) | 지정된 초기용량을 갖는 ArrayList 생성 |
- 객체를 선언할 때, 매개변수를 넣지 않으면 초기 크기는 10으로 설정 됨
```java
// ArrayList<참조타입> 참조변수 = new ArrayList<>();

ArrayList<String> list1 = new ArrayList<String>();
ArrayList<Integer> list2 = new ArrayList<>();
```

### 제네릭
- ArrayList 생성 문법을 보면 `<>` 기호를 이용해 타입을 지정함
- **꺽쇠 괄호**가 바로 **제네릭**
- 만일, 꺽쇠 괄호 안에 String 타입명을 기재하면 ArrayList 클래스 자료형의 타입은 String 타입으로 지정되어 문자열 데이터만 리스트에 적재할 수 있음

## 요소 추가
| 메서드 | 설명 |
| ---- | ---- |
| boolean add(Object obj) | ArrayList의 마지막에 객체 추가 (추가에 성공하면 true 반환) | 
| void addAll(Collection c) | 주어진 컬렉션의 모든 객체를 저장 (마지막 index의 뒤로 붙임) |

```java
ArrayListy<String> newJeans = new ArrayList<String>();

newJeans.add("mj");
newJeans.add("hi");
newJeans.add("hn");
// 맨 뒤에 객체 추가

newJeans.add(0, "hr"); // 0번째에 객체 추가
newJeans.add(1, "dne"); // 1번째에 객체 추가
```

```java
ArrayList<String> newJeans1 = new ArrayList<>();
newJeans1.add("mj");
newJeans1.add("hi");
newJeans1.add("hn");

ArrayList<String> newJeans2 = new ArrayList<>();
newJeans2.add("hr");
newJeans2.add("dne");

newJeans1.addAll(newJeans2);
// newJeans1에 newJeans2의 내용을 추가

```

## 요소 삭제
| 메서드 | 설명 |
| --- | ---- |
| Object remove(int index) | 지정된 위치(index)에 있는 객체 제거 |
| boolean remove(Object obj) | 지정된 객체 제거 (성공하면 true) |
| boolean removeAll(Collection c) | 지정된 컬렉션에 저장된 것과 동일한 객체들을 ArrayList에서 제거 |
| void clear() | ArrayList를 완전히 비우기 |
| boolean retainAll(Collection c) | ArrayList에 저장된 객체 중에서 주어진 컬렉션과 공통된 것들만 남기고 제거 (removeAll 반대 버전) |

```java
newJeans.remove(0); // 0번째 삭제
newJeans.clear(); // 전체 삭제
```

## 요소 검색
| 메서드 | 설명 |
| --- | --- |
| boolean isEmpty() | ArrayList가 비어있는지 확인 |
| boolean contains(Object obj) | 지정된 객체가 ArrayList에 포함되어 있는지 확인 |
| int indexof(Object obj) | 지정된 객체가 저장된 위치를 찾아 반환 (없으면 -1)|
| int lastIndexOf(Object obj) | 지정된 객체가 저장된 위치를 뒤에서 부터 역방향으로 찾아 반환 (없으면 -1) |

```java
newJeans.contains("mj"); // "mj"가 있는지 검색

newJeans.indexOf("hi"); // "hi"가 있는지 순차적으로 검색하고 index를 반환 (없으면 -1)

newJeans.lastIndexOf("hi"); // "hi"가 있는지 역순으로 검색하고 index를 반환 (없으면 -1)
```

## 요소 얻기
| 메서드 | 설명 |
| --- | --- |
| Object get(int index) | 지정된 위치에 저장된 객체를 반환 |
| List subList(int fronIndex, int toIndex) | fromIndex부터 toIndex사이에 저장된 객체 반환 (fromIndex ~ toIndex-1) |

```java
newJeans.get(0);
```

## 요소 변경
| 메서드 | 설명 |
| --- | --- |
| Object set(int index, Object obj) | 주어진 객체를 지정한 위치에 저장. 자리에 있던 기존의 데이터는 삭제되고 새로운 데이터가 대체되어 들어감 |
```java
newJeans.set(0, "MinJi");
```

## 용량 확장
| 메서드 | 설명 |
| --- | --- |
| int size() | ArrayList에 저장된 객체의 개수를 반환 |
| void ensureCapacity(int minCapacity) | ArrayList의 용량이 최소한 minCapacity가 되도록 함 |
| void trimToSize() | 용량의 크기에 맞게 줄임 (빈 공간 없앰) |

```java
newJeans.size(); // 5
```

## 복사
| 메서드 | 설명 |
| --- | --- |
| Object clone() | ArrayList 복제 |

## 배열 변환
| 메서드 | 설명 |
| --- | --- |
| Object[] toArray() | ArrayList에 저장된 모든 객체들을 배열로 반환 |
| Obejct[] toArray(Object[] objArr) | ArrayList에 저장된 모든 객체들을 배열 objArr에 담아 반환 |


## 정렬
| 메서드 | 설명 |
| --- | --- |
| void sort(Comparator c) | 지정된 정렬기준(c)으로 ArrayList를 정렬(원본 리스트 자체를 변경) |
```java
// 오름차순 정렬
newJeans.sort(Comparator.naturalOrder());

// 내림차순 정렬
newJeans.sort(Comparator.reverseOrder());
```

## 순회
```java
for(int i = 0; i < newJeans.size(); i++){
    System.out.println(newJeans.get(i));
}
```
```java
for(String i : newJeans){
    System.out.println(i);
}
```

#### 🔎 참고한 글


[Java ArrayList](https://www.w3schools.com/java/java_arraylist.asp)  
[자바 ArrayList 구조 & 사용법 정리](https://inpa.tistory.com/entry/JAVA-%E2%98%95-Vector-%EC%82%AC%EC%9A%A9%EB%B2%95-%EB%8F%99%EA%B8%B0%ED%99%94-%EB%AC%B8%EC%A0%9C%EC%A0%90-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0)
