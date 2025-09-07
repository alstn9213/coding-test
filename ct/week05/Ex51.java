package ct.week05;

import java.util.TreeSet;
// TreeSet
public class Ex51 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(80);
        scores.add(70);
        scores.add(100);
        scores.add(90); // 중복 안됨
        System.out.println(scores);

        Integer score = null;
        score = scores.first(); // 값이 가장 작은 객체를 가져온다.
        System.out.println("first : " + score);

        score = scores.last(); // 값이 가장 큰 객체를 가져온다.
        System.out.println("last : " + score);

        score = scores.lower(88); // 88보다 작은 값
        System.out.println("lower : " + score);

        score = scores.higher(88); // 88보다 큰 값
        System.out.println("higher : " + score);

    }
}
