package ct.week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map
* */
public class Ex25 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동",70);
        map.put("이몽룡", 100);
        map.put("변학도", 80);
        map.put("홍길동", 90);

        System.out.println(map.size());
        System.out.println(map.get("홍길동"));
        System.out.println(map.get("홍길도"));
        System.out.println(map.getOrDefault("홍길도", 0));

//        map -> set
        Set<String> keySet = map.keySet();
        for(String s : keySet) {
            System.out.printf("%s = %d\n", s, map.get(s));
        }


        map.remove("홍길동");
        System.out.println(map.isEmpty());
    }
}
