package ct.week02;

interface A {
    int w = 10;
    int h = 20;

    static int x = 1, y=2;
    public static final int z = 3;
    void a();
    public void b();
}

interface C {

}
class B implements A, C {

    @Override
    public void a() {
        System.out.println("A Method");
    }

    @Override
    public void b() {
        System.out.println("B Method");

    }
}

public class InterfaceTest {
    public static void main(String[] args) {
//        A a = new A(); 인터페이스는 객체 생성불가
        System.out.println("w= " + A.w);
        System.out.println("h= " + A.h);
        System.out.println("x= " + A.x);
        System.out.println("y= " + A.y);
        System.out.println("z= " + A.z);

        B b = new B();
        b.a();
        b.b();
    }
}
