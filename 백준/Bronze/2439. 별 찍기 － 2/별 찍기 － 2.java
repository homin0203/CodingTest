import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 1; i < num+1; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < num-i; j++) {
                sb.append(" ");
            }
            for(int k = 0; k < i; k++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}