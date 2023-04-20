import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str;
        str = sc.nextLine().trim();
        if(!str.equals("")) {
            String[] strArr = str.split(" ");
            count = strArr.length;
        }
        System.out.println(count);
    }
}