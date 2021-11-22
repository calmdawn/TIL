# 자료구조 - Queue(큐) 

- 가장 처음에 들어온 데이터가 가장 먼저 나가는 선입선출, FIFO(First In First Out)형태의 자료구조

- Enqueue : 큐에 데이터를 추가
- Dequeue : 큐에 데이터를 삭제
---

## 1. 1 선언 및 사용방법

~~~java
import java.util.Queue;
import java.util.LinkedList;

Queue<Integer> queueOne = new LinkedList<>();   //타입 생략
Queue<Integer> queue = new LinkedList<Integer>();   //

queue.offer(3); //  큐에  3을 추가
queue.add(5);   //  큐에  5를 추가 

queue.peek();   //  큐의 첫번째 값을 확인만 함
queue.element();   //  큐의 첫번째 값을 확인만 함

queue.poll();   //  큐의 첫번째 값을 가져오고 큐에서 삭제
queue.remove();   //  큐의 첫번째 값을 가져오고 큐에서 삭제

~~~

## 1. 2 연산에 따른 시간복잡도

### 1. 2. 1 탐색
- 특정 데이터를 찾을 때까지 이동해야 함. = O(n)

### 1. 2. 2 추가 및 삭제
-  큐의 처음위치에 추가하거나 마지막 위치에서 삭제가 일어나는 경우임. = O(1)

---

## 2. 유사한 메서드 동작 비교

- 큐에는 추가, 삭제, 검사의 기능을 수행할 수 있도록 두가지 형태의 메서드를 제공함.

    ||예외 발생|값 리턴|
    |-----|---|---|
    |Enqueue(추가)|add()|offer()|
    |Dequeue(삭제)|remove()|poll()|
    |peek(검사)|element()|peek()|

### 2. 1 Exception(예외)를 발생하는 메서드

- add() : 삽입 성공시 true, 삽입 실패시 예외(IllegalStateException) 발생.
- remove() : 선입 된 데이터 제거 후 해당 데이터 반환, 큐가 비어있는 경우 예외 발생.
- element() : 선입 된 데이터 반환, 큐가 비어있는 경우 예외 발생.

### 2. 2 값을 리턴하는 메서드

- offer() : 삽입 성공시 true, 삽입 실패시 false 반환.
- poll() : 선입 된 데이터 제거 후 해당 데이터 반환, 큐가 비어있는 경우 null 반환.
- peek() : 선입 된 데이터 반환, 큐가 비어있는 경우 null 반환.