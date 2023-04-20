import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int index = 0;
        str = sc.nextLine();
        index = sc.nextInt()-1;
        
        System.out.print(str.charAt(index));
    }
}