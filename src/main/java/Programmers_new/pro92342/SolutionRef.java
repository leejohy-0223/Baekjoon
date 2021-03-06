package Programmers_new.pro92342;

import java.util.ArrayList;
import java.util.List;

public class SolutionRef {

    static List<int[]> answers = new ArrayList<>();
    static int[] gameResult = new int[11];
    static int[] gameScore;
    static int[] apeachScore;
    static int N;
    static int maxValue = 0;

    public int[] solution(int n, int[] info) {
        apeachScore = info.clone();
        N = n;
        permu(0);

        if (maxValue == 0) {
            return new int[] {-1};
        }

        answers.sort(((o1, o2) -> {
            for (int i = 10; i >= 0; i--) {

                // if (o1[i] != o2[i]) { // 두 값이 다를 경우에 뺄셈을 통해 정렬 여부를 수행한다. 뺄셈이 양수일 경우에만 정렬을 변경)
                //     return o2[i] - o1[i]; // 양수일 경우, o2가 더 앞으로 와야하므로 자리가 변경된다
                // }

                if (o1[i] < o2[i]) {
                    return 1; // 내림차순으로 정렬하기 위해, 뒤에가 크면 자리를 바꾼다.
                }
                if (o1[i] > o2[i]) {
                    return -1; // 내림차순으로 정렬하기 위해, 앞에가 크면 유지한다.
                }
            }
            // {1, 1, 2, 3, 5} o2
            // {0, 0, 1, 2, 3} o1
            // 맨 뒤에서부터 비교한다.
            // != 비교, 크기 비교로 바로 검증된다.


            // {1, 1, 2, 3, 3} o2
            // {0, 0, 1, 2, 3} o1
            // 맨 뒤에서부터 비교한다.
            // != 비크기 비교로 바로 검증된다.
            return 0;
        }));

        return answers.get(0);
    }

    private void permu(int now) {
        if (now == 11) {
            int remain = N;
            int apeach = 0, lion = 0;
            gameScore = new int[11];
            for (int i = 0; i < 11; i++) {
                // 져야하는 판이면 화살을 아낀다.
                if ((gameResult[i] == 0)) {
                    if (apeachScore[i] != 0) {
                        apeach += (10 - i);
                    }
                    continue;
                }
                // 이겨야하는 판이라면
                remain -= (apeachScore[i] + 1);
                if (remain < 0) {
                    for (int j = i; j < 11; j++) {
                        if (apeachScore[j] != 0) {
                            apeach += (10 - j);
                        }
                    }
                    break;
                }
                // 이기는게 가능하다면, 점수 및 사용판에 적용
                lion += (10 - i);
                gameScore[i] = (apeachScore[i] + 1);
            }

            // 화살 남았으면 맨 뒤에 몰아준다.
            if (remain > 0) {
                gameScore[10] = remain;
            }

            // 화살 정산
            if (lion > apeach) {
                if (maxValue < (lion - apeach)) {
                    maxValue = (lion - apeach);
                    answers.clear();
                    answers.add(gameScore.clone());
                    return;
                }
                if (maxValue == (lion - apeach)) {
                    answers.add(gameScore.clone());
                }
            }
            return;
        }

        for (int i = 0; i < 2; i++) {
            gameResult[now] = i;
            permu(now + 1);
        }
    }

    public static void main(String[] args) {
        SolutionRef s = new SolutionRef();
        // int[] solution = s.solution(5, new int[] {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0});
        // int[] solution = s.solution(1, new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        // int[] solution = s.solution(9, new int[] {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1});
        int[] solution = s.solution(10, new int[] {0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3});
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
