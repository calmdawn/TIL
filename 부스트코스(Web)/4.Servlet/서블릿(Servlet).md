## 자바 웹 어플리케이션(Java Web Application)

- WAS에 설치되어 동작하는 웹 어플리케이션입니다.
- 정적 웹 프로그래밍 방식의 단점을 보완하고 동적인 서비스를 제공합니다.
- HTML, CSS, 이미지, JAVA로 작성된 클래스, 리소스 등이 포함됩니다.

### 자바 웹 어플리케이션의 구조

- 자바 웹 어플리케이션의 기본구조는 다음과 같습니다.
![image](https://user-images.githubusercontent.com/46203866/91865811-bc8b5780-ecac-11ea-9ccd-998dab4e8dda.png)

--- 

## Servlet

- 자바 웹 어플리케이션(WAS)의 구성요소 중 하나로, 클라이언트의 요청에 따라 동적인 처리를 하는 서버측 프로그램입니다.
- WAS에 동작하는 JAVA클래스 입니다.
- Servlet으로 동작하려면 HttpServlet 클래스를 상속받아야 합니다.
- 웹 페이지 구성(HTML)은 JSP로, 복잡한 프로그래밍은 Servlet으로 구현합니다.

### 버전별 Servlet 작성 방법

- Servlet 3.0 이상일 경우
    - web.xml 파일을 사용하지 않습니다.
    - 자바 어노테이션(annotation)을 사용해 등록합니다.
        - 예) @WebServlet("URL주소")
- Servlet 3.0 미만일 경우
    - web.xml 파일에 직접 등록하여 사용합니다.

### Servlet Lifecycle

- Servlet 생명주기는 다음과 같습니다.

![image](https://user-images.githubusercontent.com/46203866/91873520-13485f80-ecb4-11ea-871f-729d690e593d.png)

- 1 WAS는 서블릿 요청을 받으면 서블릿이 메모리에 있는지 확인합니다.
- 2 메모리에 없는 경우
    - 해당 서블릿 클래스를 호출하여 객체를 생상하고 메모리에 적재한다.
    - init() 호출하여 서블릿을 초기화한다.
- 3 메모리에 이미 존재하는 경우
    - service() 호출하여 브라우저의 요청을 처리합니다. 예) http요청[GET, POST, PUT, DELETE 등]
- 4 WAS가 종료 또는 새롭게 갱신될 경우
    - destory() 호출하여 서블릿을 제거합니다.
