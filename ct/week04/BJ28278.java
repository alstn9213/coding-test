package ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class BJ28278 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 >>> ");
        int n = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String cmd = s.split(" ")[0];
            if(cmd.equals("1")) {
                sb.append(stack.push(Integer.parseInt(s.split(" ")[1])));
            } else if(cmd.equals("2")) {
                if(stack.isEmpty()) {
                    sb.append("-1");
                } else {
                    sb.append(stack.pop());
                }
            } else if(cmd.equals("3")) {
                sb.append(stack.size());
            } else if (cmd.equals("4")) {
                if(stack.isEmpty()) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            } else if (cmd.equals("5")) {
                if(stack.isEmpty()) {
                    sb.append("-1");
                } else {
                    sb.append(stack.peek());
                }
            }
        }
        for(int i=0;i<sb.length();i++) {
            System.out.println(sb.charAt(i));
        }
    }
}
