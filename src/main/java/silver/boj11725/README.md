# [BOJ 11725 : 트리의 부모 찾기](https://www.acmicpc.net/problem/11725)
- 랭크 : Silver 2
  <br><br>
  
### 문제 정리
- 루트 없는 트리가 주어진다. 이때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.
<br><br>

### 문제 풀이
- 접근 (Main)
  1. 각 노드 간 연결을 ArrayList<ArrayList<Integer>> list에 담는다. 양방향 연관관계를 적용한다.
  2. 루트는 1이므로, 1 대상으로 BFS를 진행한다. 이 때 1과 연결된 노드들의 list의 parent를 1로 갱신한다.
  3. 그리고 나서 이들을 큐에 넣는다. 체크도 진행한다.
  4. 다음번 반복에서 동일하게 1의 자식 노드 대상으로 동일하게 진행한다. 
  5. BFS가 끝난 후, 1을 제외하고 모든 노드에 대해서 parent[i] 값을 출력한다. 
    
    


    
    

