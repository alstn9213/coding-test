package ct.week01;
// 반복문 while, do~while
public class Ex07 {
    public static void main(String[] args) {
        int i = 0, j = 0;
//        while(true) {
//            i++;
//            if(i == 50) {
//                System.out.println("111");
//                break;
//            } else {
//                System.out.println(i);
//            }
//        }
        while(i > 5) {
            System.out.println("출력");
            i++;
        }

        do {
            System.out.println(j++);
        } while(j > 5);
    }
}
