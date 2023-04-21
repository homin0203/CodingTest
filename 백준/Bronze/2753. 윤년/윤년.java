import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        
        int a = sc.nextInt();
        
        if(a%400 == 0) {
            result = 1;
        } else if(a%4 == 0 && a%100 != 0) {
            result = 1;
        } 
        
        System.out.print(result);
    }
}