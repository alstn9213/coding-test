package ct.week03;

import java.util.Collections;
import java.util.PriorityQueue;

// PriorityQueue(우선순위 큐)
public class Ex33 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 오름차순
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순

        pq.add(1);
        pq.add(10);
        pq.add(8);
        pq.add(17);
        pq.add(25);
        pq.add(16);
        pq.add(7);

        pq2.add(1);
        pq2.add(10);
        pq2.add(8);
        pq2.add(17);
        pq2.add(25);
        pq2.add(16);
        pq2.add(7);

        System.out.println(pq);
        System.out.println(pq2);


    }
}
