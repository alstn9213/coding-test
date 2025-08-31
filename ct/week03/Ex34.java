package ct.week03;

import java.util.Arrays;
import java.util.Scanner;

// 배열로 큐 만들기
// add(1), peek(2), pol(3), clear(4), print(5), exit(0)
public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayQueue que = new ArrayQueue(5);
        System.out.println("============================================");
        System.out.println("1.add 2.peek 3.poll 4.clear 5.print 0.exit");
        System.out.println("============================================");
        while (true) {
            System.out.print("명령어 입력 >>> ");

            int n = sc.nextInt();

            if(n == 0) break;

            switch (n) {
                case 1:
                    System.out.print("값을 입력 >>> ");
                    int m = sc.nextInt();
                    if(m < 0) {
                        System.out.println("양수만 입력");
                    } else {
                        System.out.println(que.add(m));
                    }
                    break;
                case 2:
                    System.out.println(que.peek());
                    break;
                case 3:
                    System.out.println(que.poll());
                    break;
                case 4:
                    que.clear();
                    break;
                case 5:
                    que.print();
                    break;
                default:
                    System.out.println("다시 입력하세요!!");
            }
        }
    }
}

class ArrayQueue {
    private int[] queue; // 큐
    private int max; // 최대용량
    private int cnt; // 데이터 수
    private int front; // 배열 맨앞 커서
    private int rear; // 배열 맨 뒤 커서

    public ArrayQueue(int max) {
        this.max = max;
        this.queue = new int[max];
        Arrays.fill(queue, -1); // 배열의 값을 모두 채우는 메서드 fill
        this.cnt = this.front = this.rear = 0;
    }

    public int add(int m) {
        if(cnt >= max) {
            System.out.println("Queue is full");
            return -1;
        } else {
            queue[rear++] = m;
            cnt++;
            if(rear == max) rear = 0;
        }
        return m;
    }

    public int peek() {
        if(cnt <= 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public int poll() {
        if(cnt <= 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int n = queue[front];
        cnt--;
        if(cnt < 0) cnt = 0;
        queue[front++] = -1;
        if(front >= max) front = 0;
        return n;
    }

    public void clear() {
        this.cnt = this.front = this.rear = 0;
        Arrays.fill(queue, -1);
    }

    public void print() {

        if(cnt <= 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(Arrays.toString(queue));
        }
    }
}
