# home_sweet_home
재택근무 시 자리비움 표시가 안 뜨게 하기 위한 간단한 프로그램

---
```
Q1. timertask 왜 썼는지?
A1. N분에 한 번씩 마우스 이벤트를 수행하고 싶어서 사용했으나, while문으로 대체하여ㅛㅆ음 
Q2. btn2_action 이벤트 선언까진 좋은데, 왜 줬는지?
멈추고 싶으면 이벤트를 받는 핸들러가 달라야할 듯
3. 루프 조건에 true로 주고 루프 사이 sleep 주고 최상위 컴포넌트에
키 이벤트 할당한 다음에 이벤트 액션으로는 루프 조건 변수를 토글하는 형태로하기

//어려웠던 점
버튼을 누르면 중지 버튼을 누르기 전까지 실행 이벤트가 계속 수행되게 하고 싶음
-> while(true)를 하다보니 버튼을 누르면 중지 버튼이 안 눌리는 사태 발생
```
