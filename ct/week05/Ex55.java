package ct.week05;

import java.util.Arrays;
import java.util.Scanner;

/*
* 버블 정렬
* */
public class Ex55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
        }
        System.out.println("정렬 전");
        System.out.println(Arrays.toString(x));
//        System.out.println(x.toString()); [I@4769b07b
        bubbleSort(x);
        System.out.println("정렬 후");
        System.out.println(Arrays.toString(x));


    }
    static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}


