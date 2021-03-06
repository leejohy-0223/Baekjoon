# [BOJ 8979 : 올림픽](https://www.acmicpc.net/problem/8979)
- 랭크 : Silver 5
  <br><br>
  
### 문제 정리
- 각 국가의 금, 은, 동메달 정보를 입력받아서, 어느 국가가 몇 등을 했는지 알려주는 프로그램을 작성하시오.

   <br><br>

### 문제 풀이
- 접근 1(Main) 
    - 금 / 은 / 동 순서에 맞게 정렬을 한다.
    - 1등 나라를 ref로 잡아놓고, 모든 나라에 대해 for를 돌린다.
    - ref와 현재 선택된 나라 간 메달 비교를 하고, 같을 경우 rank count를 올린다. 
    - 다를 경우, rank에 rank count를 더한다. 그리고 다시 rank count를 0으로 갱신한다.
    - 현재 선택된 나라가 K(찾는 나라)일 경우, rank를 출력하고 종료한다.
  
- 접근 2(MainRef) - sort 필요 없음
    - 모든 정보를 map[i][4]에 저장한다. 인덱스 별로 금 / 은 / 동을 저장한다.
    - K의 정보를 추출한다. cnt를 0으로 둔다.
    - 모든 map을 돌리며, 금이 같을경우 은 -> 은이 같을경우 동 순서대로 비교한다. 
    - 만약 K보다 우위일 경우, cnt를 하나 증가시킨다.
    - 즉, K가 1위라고 생각하고 하나씩 비교하며 K의 순위를 낮추는 방식이다.
    
    
  

    
    


    
    


