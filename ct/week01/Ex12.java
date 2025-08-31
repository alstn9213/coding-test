package ct.week01;

import java.util.Arrays;

// 1차원 배열
public class Ex12 {
    public static void main(String[] args) {
        short[] sh;
        int i[];

        sh = new short[3];
        sh[0] = 1;
        char[] ch = {'A', 'B', 'C'};
        ch[0] = 'a';
        ch[1] = 'E';
//        ch[3] = 'Z';
        System.out.println(ch.length);
        System.out.println(Arrays.toString(ch)); // 대문자 객체의 메서드를 사용할 때 import를 해야하지만 String, Math, System은 예외
        System.out.println(ch.toString());
        }
}
