import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        sc.nextLine();
        String numStr = sc.next();
        
        int sum = 0;
        
        for(int i = 0; i < numStr.length(); i++) {
            sum += numStr.charAt(i)-48;
        } 
        
        System.out.print(sum);
    }
}