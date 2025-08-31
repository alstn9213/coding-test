package ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            que.add(i);

        }
        while (que.size() > 1) {
            que.poll();
            que.offer(que.poll());
        }
        System.out.println(que.peek());

    }
}
