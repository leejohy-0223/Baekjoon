# [BOJ 3048 : 개미](https://www.acmicpc.net/problem/3048)
- 랭크 : 실버 4
  <br><br>
  
### 문제 정리
- T초가 지난 후에 개미의 순서를 출력한다. 첫 번째 개미 그룹은 왼쪽에서 오른쪽으로 움직이고, 두 번째 그룹은 반대 방향으로 움직인다.

   <br><br>

### 문제 풀이
- 접근 (Main) 
    - 첫번째 개미 그룹만 움직이면 된다. 이 개미 그룹의 움직임에만 집중했다.
    - 인덱스를 하나씩 올리면서 확인한다. 
       - 개미 그룹에 속해있지 않을 경우 pass
       - 개미 그룹에 속해있으며, 다음 개미가 다른 그룹일 경우 swap
       - swap했을 경우, 다음 i는 바뀐 자신을 다시 가리키게 되므로 i++를 한번 더 해준다.

  

    
    


    
    


