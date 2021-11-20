# 자료구조 - Queue(큐) 

- 가장 처음에 들어온 데이터가 가장 먼저 나가는 선입선출, FIFO(First In First Out)형태의 자료구조

---

## 1. 1 선언 및 사용방법

~~~java
import java.util.Queue;
import java.util.LinkedList;

Queue<Integer> queueOne = new LinkedList<>();   //타입 생략
Queue<Integer> queue = new LinkedList<Integer>();   //

queue.offer();
queue.add();

~~~