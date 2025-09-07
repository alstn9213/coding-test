package ct.week05;

import java.util.Arrays;
// 삽입정렬
public class Ex57 {
    public static void main(String[] args) {
        int[] x = {6,4,8,3,1,9,7};
        System.out.println("정렬 전");
        System.out.println(Arrays.toString(x));
        insertSort(x);
        System.out.println("정렬후");
        System.out.println(Arrays.toString(x));
    }

    static void insertSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int j;
            int tmp = arr[i];
            for(j = i; j > 0 && arr[j-1] > tmp; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = tmp;
        }
    }
}
