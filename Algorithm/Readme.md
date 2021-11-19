## 코딩테스트 자주 쓰이는 메서드 개념 및 사용법 정리

### 1. 배열
~~~java
int[] arr = new int[10];

arr.length;
~~~
-   length : 배열의 총 길이를 반환해주는 함수
<br/></br>
### 2. 문자열 처리
~~~java
String text = "reminiscence second run"

text.length();
text.indexOf();
text.indexOf();
~~~
-   length() : 문자열의 길이를 반환해주는 함수
-   indexOf("찾고싶은 문자열") : 찾고자하는 문자열의 위치를 반환하는 함수. 없는 경우 -1 반환
    -   indexOf(String str) : str 찾을 문자
    -   intdexOf(String str, int fromIndex) : str 찾을 문자, fromIndex 탐색 시작 위치