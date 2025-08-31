package ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Queue
public class BJ2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            que.offer(i);
        }
        while(que.size() > 1) {
            System.out.printf("%d ", que.poll());
            que.add(que.poll());
        }
        System.out.print(que.peek());
    }
}
