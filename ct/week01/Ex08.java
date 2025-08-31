package ct.week01;
// 이중반복문 & break label
public class Ex08 {
    public static void main(String[] args) {
        bl:while(true) {
            for(int i=0; i<100; i++){
                if(i == 50) break bl;
                System.out.println(i);

            }
        }
    }
}
