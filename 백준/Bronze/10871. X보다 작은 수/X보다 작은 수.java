import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        //N, X 가져오기
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        //N 만큼 반복
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a < x) {
                sb.append(a+" ");
            } 
        }
   
        System.out.println(sb);
    }
}