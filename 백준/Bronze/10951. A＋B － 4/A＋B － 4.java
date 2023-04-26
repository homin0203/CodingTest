import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        //각 테스트 케이스의 합 StringBuilder에 추가
        try {
            while(true) {
                sb.append(sc.nextInt()+sc.nextInt()).append('\n');
            }
        } catch(NoSuchElementException e) {
            //테스트 케이스가 더 없어서 NoSuchElementException 발생 시 출력
		    System.out.println(sb);
        }
    }
}