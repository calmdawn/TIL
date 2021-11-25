# 자료구조 - HashMap(해쉬 맵)

- Key-Value 쌍으로 구성되어 데이터를 저장하는 자료구조
- Key는 중복된 값을 가질 수 없지만 Value는 중복된 값을 가질 수 있음.
- 동일한 Key를 사용할 경우 마지막에 사용된 Key의 Value 값으로 값이 대체됨.

---

## 1. 1 선언 및 사용방법

~~~java
import java.util.HashMap;

HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
hashMap.put("apple", 1);    //해쉬맵에 key : apple, value : 1 인 값 추가
hashMap.put("banana", 7);   //해쉬맵에 key : banana value : 7 인 값 추가
hashMap.get("apple");       //key값이 "apple"인 데이터의 value 값 반환. 이 경우 1, 해당 key값이 없는 경우 null 반환
hashMap.remove("apple");    //key 값이 "apple"인 데이터 제거
hashMap.containsKey("banana");  //key가 "banana"인 데이터 유무 확인. 존재하면 true, 존재하지 않으면 false
ashMap.containsValue(7);    //value가 7인 데이터 유무 확인. 존재하면 true, 존재하지 않으면 false

~~~