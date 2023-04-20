import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();

        int bNum = b;
        
        while(bNum > 0){
            System.out.println(a*(bNum%10));
            bNum = bNum/10;
        }
        System.out.println(a*b);
    }
}