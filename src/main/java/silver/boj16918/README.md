# [BOJ 16918 : 봄버맨](https://www.acmicpc.net/problem/16918)
- 랭크 : 실버 1
  <br><br>
  
### 문제 정리
- 폭탄의 규칙에 맞게 설치 및 폭파 후 주어진 시간에 형태를 출력하면 된다.
<br><br>

### 문제 풀이
- 접근(Main) 
   - 짝수의 시간에 폭탄을 설치, 홀수의 시간에 폭파를 반복했다.
   - 코드는 좀 복잡하지만 기능은 간단하다.
   - 시간이 매우 걸린다.
- 접근 2(MainRef)
   - 확인해보면 폭탄 맵이 반복된다. 2, 4, 6 ... 짝수는 모든 보드에 폭탄이 설치되어 있는 형태이다.
   - 3, 7, 11 ... 및 5, 9, 13 ... 이 반복된다. 4의 크기로 반복되므로, 이를 이용해서 만들어놓은 보드를 출력한다.
   - 4씩 반복되므로, 확인하고자 하는 수 % 4를 해서 3이 나오면 3의 패턴을, 1이 나오면 5의 패턴을 활용한다.  

  
    
    


    
    


