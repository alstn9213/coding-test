package ct.week01;
// 문자열
public class Ex10 {
    public static void main(String[] args) {
        String s = "AGood Morning!";
        System.out.println("charAt : " + s.charAt(7));
        System.out.println("startsWith : " + s.startsWith("good"));
        System.out.println("endsWith : " + s.endsWith("ng!"));
        System.out.println("equals : " + s.equals("good Morning!"));
        System.out.println("indexOf : " + s.indexOf("n"));
        System.out.println("lastIndexOf : " + s.lastIndexOf("n"));
        System.out.println("length : " + s.length()); // 공백포함해서 계산

        System.out.println("replace : " + s.replace("Good", "good"));
        System.out.println("replace : " + s.replace("o", "a"));
        System.out.println("replaceFirst : " + s.replaceFirst("o", "a")); // 처음 만나는 하나만 바꾼다.

        System.out.println("replaceAll : " + s.replaceAll("Good", "good")); // 대괄호가 없으면 replaceAll과 같다
        System.out.println("replaceAll : " + s.replaceAll("[Good]", "a"));  // [G 또는 o 또는 o 또는 d]를 a로 바꾼다.

        System.out.println("replaceAll : " + s.replaceAll("[^G]", "a")); //[^G]는 G외의 문자
        System.out.println("replaceAll : " + s.replaceAll("^[A]", "a")); // ^[] 는 startsWith
        System.out.println("replaceAll : " + s.replaceAll("[G]$", "a")); // []$ 는 endsWith


        String str = "1234567890ABCDEFGabcdefg";
        System.out.println(str.replaceAll("[0-9]", ""));



    }
}
