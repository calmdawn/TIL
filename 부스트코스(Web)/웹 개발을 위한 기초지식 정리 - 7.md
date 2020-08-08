## 1.1.7 WAS(Web Application Server)

![WAS](https://user-images.githubusercontent.com/46203866/89717458-cee9dc80-d9f1-11ea-9eee-ce46d9dca975.jpg)

- 미들웨어중 하나로 클라이언트(웹서버)와 DBMS 사이에서 동작하며 동적인 데이터 처리를 수행함

#### 웹 서버와 WAS는 비슷해보이지만 다름

- 웹서버는 정적인 테이터(html, css, javascript)를 제공하는 서버
- WAS(Web Application Server)는 동적인 데이터(DB조회, 로직처리 등)를 제공하는 서버

---

### 미들웨어(MiddleWare)

![MiddleWare](https://user-images.githubusercontent.com/46203866/89717444-b974b280-d9f1-11ea-95a6-9ff5460a3def.png)

- 클라이언트와 DBMS 사이에 다른 서버를 두는 방식처럼 두가지 다른 종류의 응용프로그램 사이의 조정 및 중개를 담당하는 소프트웨어

---

### DBMS (DataBase Management System)

![DBMS](https://user-images.githubusercontent.com/46203866/89717454-c8f3fb80-d9f1-11ea-9105-f28888b6334a.png)

- 다수의 사용자들의 요구에 따라 DB내부 데이터에 접근하여 정보생성 및 DB를 관리할 수 있게 해주는 소프트웨어

---

### WAS도 자체적으로 웹 서버의 기능을 내장하고 있음
- 과거에는 성능이 웹서버에 비해 떨어졌지만 현재는 성능상 큰 차이는 없다
- 그러나 WAS만 사용하는 것을 추천하 않음

### 규모가 클수록 웹 서버와 WAS를 분리하는 이유
- 웹 서버는 정적인 자원만, WAS는 동적인 자원만 처리함으로써 서버부담을 줄이고 자원을 효율적으로 사용함
- 장애극복기능을 통해 무중단으로 운영하기 위해
- 배포및 유지보수의 편의성을 위해 
