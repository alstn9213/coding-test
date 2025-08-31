package ct.week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 로그인
public class Ex26 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("spring","1234");
        map.put("summer", "5678");
        map.put("fall", "9012");
        map.put("winter", "3456");
        Scanner scanner = new Scanner(System.in);
        int failCnt = 0;
        while(true) {
            System.out.println("---아이디와 비밀번호 입력---");
            System.out.print("아이디 : ");
            String id = scanner.nextLine();
            System.out.print("비밀번호 : ");
            String pswd = scanner.nextLine();
            if(map.containsKey(id)) {
                if(map.get(id).equals(pswd)) {
                    System.out.println("로그인 성공!!!");
                    break;
                } else {
                    failCnt++;
                    System.out.println("비밀번호 불일치!!");
                }
            } else {
                failCnt++;
                System.out.println("아이디가 존재하지 않음!!");
            }
            if(failCnt >= 5) break;
        }
    }
}
