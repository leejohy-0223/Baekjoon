# [BOJ 1475 : 방 번호](https://www.acmicpc.net/problem/1475)
- 랭크 : 실버5
  <br><br>
  
### 문제 정리
1. 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력한다.
2. 단 6은 9와 호환되므로, 1세트에서 2번 서로 사용할 수 있게 된다.   
   <br><br>

### 문제 풀이
- 접근 1(Main) : HashMap을 이용해서 직접 사용 가능한 숫자들을 계산했다.
- 접근 2(MainArray)
    1. 숫자의 각각 횟수를 배열에 담은 후, 6과 9에 대한 추가 처리가 필요하다.
    2. 다음 공식을 사용한다. num[6] = (num[6] + num[9] + 1) / 2   
    3. 예를 들어 6이 3회, 9가 4회 나왔을 경우, 최소 4세트가 필요하다. 3+4+1/2 = 4이다.
    4. 6이 1회, 9가 4회 나왔을 경우, 1+4+1/2 = 3세트가 필요하다.
    5. 6이 0회, 9가 4회 나왔을 경우, 0+4+1/2 = 2세트가 필요하다.
    
    


    
    


