# 자료구조 - 그리디 알고리즘(Greedy Algorithm, 탐욕법) 

#### 그리디 알고리즘은 문제해결 과정속에서 매 순간 최적이라 생각되는 답을 결정하고, <br><br>이러한 결정들을 통해 최종적인 해답에 도달하는 문제 해결 방식입니다.
 
### 정답

 - 백준 11047번

  ![그리디_11047번](https://user-images.githubusercontent.com/46203866/95679569-a313ee80-0c0e-11eb-8c03-269cbd8c0612.PNG)

 - 백준 1931번
 
   <img width="1150" alt="무제" src="https://user-images.githubusercontent.com/46203866/95993012-8b847200-0e69-11eb-8122-96c8c6486c8a.png">
    
    - 문제<br>1.시간초과<br> 2.회의시간을 정렬하지 않아서 경계값과 체크순서에따라 다른결과<br> 3. 미리값을 제거한 이후 배열을 복사했지만 오류발생
    - 해결<br>1.배열에 담은 모든 회의시간을 체크하기때문에 발생함. 이후 회의시간에 다른회의시간이 있을경우 break를 추가하여 해결<br>
          2.회의시간이 0시간, 동일한 회의시간을 제거하고 배열을 추가함<br>        
          3.
          
          if(conferenceInfo[i][0] == conferenceInfo[i][1]) { // 시작과 종료가 같은경우
           maxNum++;
           N = N - 1;
           i = i - 1;
          }

   - 시간초과, 경계값은 해결했지만 복사한 배열의 경우 반례를 찾기가 힘들었다

 - 백준 11399번
   
  ![그리디_11399번](https://user-images.githubusercontent.com/46203866/96016800-28540900-0e84-11eb-8912-0fd538120be6.PNG)
  
  - 백준 1541번
  
  ![그리디_1541번](https://user-images.githubusercontent.com/46203866/96271225-96750900-1007-11eb-9c05-3bd7bb68ad69.PNG)

  
### 오답




