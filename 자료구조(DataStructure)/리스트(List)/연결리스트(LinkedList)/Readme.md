# 자료구조 - LinkedList(연결리스트)

- 각 노드가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식의 자료구조.
- 노드(Node)란 기초적인 단위를 의미하는 말로써 여기서는 데이터와 포인터를 가진 객체를 의미함.

---

## 1. 1 선언 및 사용방법

~~~java
import java.util.LinkedList;

LinkedList<Integer> linkedList = new LinkedList<Integer>();

linkedList.add(3);      //  연결리스트 가장 마지막에 3 추가
linkedList.add(0, 7);   //  0번째 인덱스에 7 추가
linkedList.get(0);      //  0번째 인덱스의 값 가져옴
linkedList.remove(0);   //  0번째 인덱스의 값 삭제
linkedList.contains(3); //  연결리스트에 3 있는 경우 true, 없는 경우 false 반환
linkedList.set(0, 5);   //  0번째 인덱스에 저장된 데이터를 5로 변경

~~~

## 1. 2 연산에 따른 시간복잡도

### 1. 2. 1 탐색
- 특정 데이터를 찾을 때까지 이동해야 함. = O(n)

### 1. 2. 2 추가 및 삭제
- 데이터를 추가하는 위치가 처음인 경우에는 노드가 가지고 있는 메모리 주소 값을 변경만 시켜주면 됨. = O(1)
- 데이터를 추가하는 위치가 처음이 아니라면 해당 위치까지 순차적으로 탐색해야 함. = O(n)
