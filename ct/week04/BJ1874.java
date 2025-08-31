package ct.week04;

import com.sun.jdi.StackFrame;

import java.util.Scanner;
import java.util.Stack;

public class BJ1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int top = 0;
        System.out.print("숫자입력 >>> ");

        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int n = sc.nextInt();
            if(n > top) {
//                스택에 값을 넣는다.
                for(int j=top+1; j<=n; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                top = n;
            } else if(n != stack.peek()) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb.toString());
    }
}
