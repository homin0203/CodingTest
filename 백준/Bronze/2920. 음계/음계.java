import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String result = "mixed";
        for(int i = 0; i < 8; i++) {
            str += Integer.toString(sc.nextInt());
        }
        switch(str) {
            case "12345678" : result = "ascending"; break;
            case "87654321" : result = "descending"; break;
        }
        
        System.out.print(result);
    }
}