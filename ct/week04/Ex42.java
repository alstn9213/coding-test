package ct.week04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        Scanner sc = new Scanner(System.in);
//        1.push 2.peek 3.pop 4.clear 5.print 0. exit
        do {
            System.out.println(String.format("%d / %d", stack.count(), stack.size()));
            System.out.println("1. push 2. peek 3. pop 4. clear 5. print 0. exit");
            System.out.print("번호 입력 >>> ");
            int n = sc.nextInt();
            if(n==0) break;
            if(n==1) {
                stack.push(sc.nextInt());
            } else if (n==2) {
                System.out.println(stack.peek());
            } else if (n==3) {
                System.out.println(stack.pop());
            } else if (n==4) {
                stack.clear();
            } else if (n==5) {
                stack.print();
            } else {
                System.out.println("Error");
            }
        } while (true);
    }
}

class ArrayStack {
    private int max;
    private int top;
    private int stack[];

    public ArrayStack() {

    }

    public ArrayStack(int max) {
        this.max = max;
        this.top = 0;
        stack = new int[max];
        Arrays.fill(stack, -1);
    }
    public void push(int n){
        if (top >= max) {
            System.out.println("Stack is full!");
        } else {
            stack[top++] = n;
        }
    }
    public int peek() {
        if(top <= 0) {
            System.out.println("Stack is empty!!");
        } else {
            return stack[top-1];
        }
        return -1;
    }

    public int pop() {
        if(top <= 0) {
            System.out.println("Stack is empty!!");
        } else {
            int n = stack[top-1];
            stack[top-1] = -1;
            top--;
            return n;
        }
        return -1;
    }

    public void clear(){
        this.top = 0;
        Arrays.fill(stack, -1);
    }

    public void print() {
        for(int s : stack) {
            if(s >= -1) {
                System.out.print(String.format("%d ", s));
            }
        }
    }

    public int size() { // 총개수
        return this.max;
    }

    public int count() { // 현재 저장된 개수
        return this.top;
    }
}