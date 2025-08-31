package ct.week01;
// 문자열 비교
public class Ex11 {
    public static void main(String[] args) {
        char c1 = 'A', c2 = 'A';
        String s1 = "A", s2 = "A";
        String s3 = new String("A");
        String s4 = new String("A");

        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s4));
    }
}
