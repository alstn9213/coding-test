package ct.week04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        Scanner sc = new Scanner(System.in);
//        1.push 2.peek 3.pop 4.clear 5.print 0. exit
        do {

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
        stack = new int[max];
        Arrays.fill(stack, -1);
    }
    public void push(int n){

    }
    public int peek() {
        return 0;
    }

    public int pop() {
        return 0;
    }

    public void clear(){

    }

    public void print() {

    }
}