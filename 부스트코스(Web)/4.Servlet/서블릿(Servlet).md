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
- Servlet 3.0 미만일 경우
    - web.xml 파일에 직접 등록하여 사용합니다.
