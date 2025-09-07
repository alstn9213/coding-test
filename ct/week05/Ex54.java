package ct.week05;

import java.util.Arrays;
import java.util.Scanner;

/*
* 이진검색
* */
public class Ex54 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 1, 9, 10, 2, 7, 4};
        System.out.print("숫자를 입력하세요 >>> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, n); // 찾는 값이 없을 경우 자바에서는 리턴값을 아무 음수값이나 반환한다.
        System.out.println(idx);
//        if(idx < 0)

    }
}
