package ct.week01;
// 반복문 for
public class Ex06 {
    public static void main(String[] args) {
//        구구단 세로
        for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.printf("%d X %d = %d\n", i, j, i*j);
            }
            System.out.println("------------------");
        }
//            구구단 가로
        for(int i=1;i<10;i++){
            for(int j=2;j<10;j++){
                System.out.printf("%d X %d = %-2d   ", j, i, i*j);
            }
            System.out.println("------------------");
        }
    }
}
