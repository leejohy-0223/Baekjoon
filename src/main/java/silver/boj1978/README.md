# [BOJ 1978 : 소수 찾기](https://www.acmicpc.net/problem/1978)
- 랭크 : Silver 4
  <br><br>
  
### 문제 정리
- 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

<br><br>

### 문제 풀이
- 접근 (Main) 
  - sqrt(입력되는 수)까지 i를 반복하며, num % i == 0이 아닌 경우 소수이고, 하나라도 나오게 되면 소수가 아님을 이용한다.
  - 예를 들어 num = 11일 때, sqrt(11) = 3이므로 2, 3에 대해서 나누어 떨어지는지를 확인하면 된다. 둘 다 나누어 떨어지지 않으므로 11은 소수이다. 
  


  

    
    


    
    


