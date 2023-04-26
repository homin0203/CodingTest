import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //두 수 문자열로 가져오기
        String str1 = sc.next();
        String str2 = sc.next();
        
        //뒤집은 수를 위한 변수
        String reverse1 = "";
        String reverse2 = "";
        
        //각 자리 위치 뒤집기
        for(int i = 2; i >= 0; i--) {
            reverse1 += String.valueOf(str1.charAt(i));
            reverse2 += String.valueOf(str2.charAt(i));
        }
        
        //결과에 따라 출력
        if(Integer.parseInt(reverse1) > Integer.parseInt(reverse2)) System.out.print(reverse1);
        else System.out.print(reverse2);
    }
}