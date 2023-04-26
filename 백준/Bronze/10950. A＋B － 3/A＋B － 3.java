import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        //테스트 케이스의 개수 가져오기
        int num = sc.nextInt();
        
        //각 테스트 케이스의 합 StringBuilder에 추가
        for(int i = 0; i < num; i++) {
            sb.append(sc.nextInt()+sc.nextInt()).append('\n');  
        }
        
        //출력
		System.out.println(sb);
    }
}