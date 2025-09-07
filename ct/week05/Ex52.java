package ct.week05;
// 선형검색(순차검색) - Sequence Search

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 1, 9, 10, 2, 7, 4};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int idx = SequenceSearch.search(arr, n);
        if(idx == -1) System.out.println("숫자를 찾을 수 없음");
        else System.out.println(String.format("찾는 숫자 %d는 arr[%d]에 존재", n, idx));

    }
}

class SequenceSearch {
    static int search(int[] arr, int key) {
        for(int i = 0; i<arr.length;i++){
            if(key==arr[i]) return i;
        }
        return -1;
    }
}
