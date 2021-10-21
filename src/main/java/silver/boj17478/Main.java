package silver.boj17478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");
        sb.append("\"재귀함수가 뭔가요?\"").append("\n");
        recursive(0, "");
        sb.append("라고 답변하였지.").append("\n");

        System.out.println(sb);

    }

    private static void recursive(int depth, String bar) {
        if (depth == n) {
            sb.append(bar);
            sb.append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
            return;
        }

        sb.append(bar);
        sb.append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
        sb.append(bar);
        sb.append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
        sb.append(bar);
        sb.append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");


        sb.append(bar).append("____");
        sb.append("\"재귀함수가 뭔가요?\"").append("\n");
        recursive(depth + 1, bar += "____");
        sb.append(bar);
        sb.append("라고 답변하였지.").append("\n");
    }
}
