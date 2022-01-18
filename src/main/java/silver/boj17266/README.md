# [BOJ 17266 : 어두운 굴다리](https://www.acmicpc.net/problem/17266)
- 랭크 : 실버 4
  <br><br>
  
### 문제 정리
- 굴다리에 가로등을 놓고, 모든 범위를 비추도록 가로등의 높이를 최소로 조절하는 문제이다.
<br><br>

### 문제 풀이
- 접근(Main) : 이분탐색 - 하한 방법을 이용한다.
    - ``mid``를 구하고, 전체 범위를 비추게 된다면 ``maxL``를 낮춰 ``mid``를 낮추고, 다시 반복한다.
    - ``possibleHeight``메서드를 통해 전체를 모두 감당할 수 있는지 여부를 확인한다.
        - ``mid`` 기준으로, 모든 ``lamp``의 범위를 계산해야 한다.
        1. ``curStart, curEnd``에 계산된 최소, 최대 범위를 넣는다.
        2. ``postEnd``, 즉 이전 계산이 오른쪽 방향 끝과 ``curStart``를 비교한다. ``curStart > postEnd``일 경우 중간에 비는 범위가 발생하므로 ``false``를 리턴한다.
        3. 2의 조건을 만족하는 경우, ``postEnd``를 ``curEnd(현재의 End)``로 다시 갱신 후 반복한다.
        4. 마지막에, ``curEnd가 >= n``일 경우 true, 아닐 경우 n까지를 비출 수 없다는 의미이므로 false를 반환한다.

  

  
    
    


    
    

