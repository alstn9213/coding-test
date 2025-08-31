package ct.week01;
// 2차원 배열
public class Ex13 {
    public static void main(String[] args) {
        int[][] a;
        int b[][];
        int[] c[];

        int d[][] = {{1,2},{3,4,5},{5,6,7,8}};
        System.out.println(d.length); // 행의 갯수
        System.out.println(d[0].length);
        for(int i=0; i<d.length; i++) {
            System.out.println(d[i].length);
        }
        d[1][2] = 7;
        d = new int[][] {{1,2},{3,4},{5,6}};
        d = new int[3][];
        d[0] = new int[4];
        d[1] = new int[3];
        d[2] = new int[10];
    }
}
