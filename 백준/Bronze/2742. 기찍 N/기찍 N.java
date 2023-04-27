import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //N
        int n = sc.nextInt();
        sc.close();
        
        //N ~ 1까지 출력값에 추가
        for(int i = n; i > 0; i--) {
            System.out.println(i);
        }
        
    }
}