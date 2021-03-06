# [BOJ 2108 : 통계학](https://www.acmicpc.net/problem/2108)
- 랭크 : Silver 4
  <br><br>
  
### 문제 정리
- 다음 4개의 통계값을 구하는 프로그램을 작성해보자.
  - 산술평균 : N개의 수들의 합을 N으로 나눈 값
  - 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
  - 최빈값 : N개의 수들 중 가장 많이 나타나는 값
  - 범위 : N개의 수들 중 최댓값과 최솟값의 차이
<br><br>

### 문제 풀이
- 접근 (Main) : 
     - 수의 빈도를 계산하기 위해 count 배열을 만든다. 마이너스 범위도 포함시켜야 하므로, 8000짜리 배열을 만들고 +4000을 더해준다. 이후 추출시에는 -4000을 해주면 된다.
     - 산술 평균 : 값을 입력받으면서 sum을 수행하고, 받은 횟수 n으로 나눈다. Math.around를 위해 double로 casting이 필요하다.
     - 중앙값 : sorting 후 n/2 인덱스를 출력한다.
     - 최빈값 : max count를 먼저 찾고, 다시한번 배열을 반복하며 max count와 일치하는 인덱스를 List에 담는다. 한 개일 경우 0 인덱스를, 2개 이상일 경우 1 인덱스를 출력한다.
         - max count인 인덱스를 먼저 List에 넣고, 갱신될 때마다 List를 clear하고 다시 넣는 방식도 있다.
     - 범위 : max - min을 출력한다. 

  
  


  

    
    


    
    


