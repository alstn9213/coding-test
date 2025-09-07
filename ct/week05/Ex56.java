package ct.week05;

import java.util.Arrays;

// 선택 정렬
public class Ex56 {
    public static void main(String[] args) {
        int[] x = {6,4,8,3,1,9,7};
        System.out.println("정렬 전");
        System.out.println(Arrays.toString(x));
        selectionSort(x);
        System.out.println("정렬 후");
        System.out.println(Arrays.toString(x));
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[idx] > arr[j]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
    }
}
