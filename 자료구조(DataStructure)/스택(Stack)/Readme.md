# 자료구조 - Stack(스택) 

- 가장 마지막에 들어온 데이터가 가장 먼저 나가는 후입선출, LIFO(Last In First Out)형태의 자료구조.

---

## 1. 1 선언 및 사용방법

~~~java
import java.util.Stack;

Stack<Integer> stack = new Stack<Integer>(); 

stack.push(5);   //  스택의 최상위에 5를 추가 
stack.peek();   //  스택의 첫번째 값을 확인만 함
stack.pop();   //  스택의 첫번째 값을 가져오고 스택에서 삭제

~~~

## 1. 2 연산에 따른 시간복잡도

### 1. 2. 1 탐색
- 특정 데이터를 찾을 때까지 이동해야 함. = O(n)

### 1. 2. 2 추가 및 삭제
-  스택의 맨위에서 추가 또는 삭제가 일어나는 경우. = O(1)

---
