package ct.week03;

import java.util.Deque;
import java.util.LinkedList;

// Deque
public class Ex32 {
    public static void main(String[] args) {
        Deque<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.offer(3);
        System.out.println(que);
        System.out.println(que.peek()); // 1
        System.out.println(que.size()); // 3
        System.out.println(que.isEmpty()); // false

        que.addFirst(4); // deque는 앞뒤로 삽입 가능
        System.out.println(que.peek()); // 4
        System.out.println(que.peekLast()); // 3
    }
}
