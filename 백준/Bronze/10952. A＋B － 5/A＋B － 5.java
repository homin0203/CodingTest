import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        //각 테스트 케이스의 합 StringBuilder에 추가
        while(true) {
            int num = sc.nextInt()+sc.nextInt();
            if(num != 0) sb.append(num).append('\n');
            else break; //마지막 입력값인 0이 나올 경우 종료 
        }
        
        //출력
        System.out.println(sb);
    }
}