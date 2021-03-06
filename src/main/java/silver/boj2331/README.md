# [BOJ 2331 : 반복수열](https://www.acmicpc.net/problem/2331)
- 랭크 : Silver 4
  <br><br>
  
### 문제 정리
- 다음과 같이 정의된 수열이 있다.
   - D[1] = A, 
   - D[n] = D[n-1]의 각 자리의 숫자를 P번 곱한 수들의 합
  <br><br>
     
- 예를 들어 A=57, P=2일 때, 
  수열 D는 {57, 74(=5^2+7^2=25+49), 65, 61, 37, 58, 89, 145, 42, 20, 4, 16, 37, …}이 된다. 그 뒤에는 앞서 나온 수들(57부터가 아니라 58부터)이 반복된다.
  <br><br>

- 이와 같은 수열을 계속 구하다 보면 언젠가 이와 같은 반복수열이 된다. 이때, 반복되는 부분을 제외했을 때, 수열에 남게 되는 수들의 개수를 구하는 프로그램을 작성하시오. 위의 예에서는 {57, 74, 65, 61}의 네 개의 수가 남게 된다.
<br><br>

### 문제 풀이
- 접근 (Main) : map에 새로 계산된 수를 key로 넣고, idx를 1씩 올리면서 저장한다. 중복된 키값이 존재할 경우, key - 1 값을 반환하면 된다.
key-1까지는 반복되지 않음을 알 수 있다.
  
- map 말고 list로 해서, contain하고 있는지 여부를 확인해도 된다. 



    
    


    
    


