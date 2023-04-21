import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //모두 대문자로 변환
        str = str.toUpperCase();
        //개수를 체크하기 위한 배열
        int[] arr = new int[26];
        
        //개수 체크(알파벳에 따라 배열 자리별로 수 증가)
        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-65]++;
        }
        
        //가장 큰 알파벳 확인용 및 출력할 변수
        int max = -1;
        char result = ' ';
        
        //제일 많이 사용된 알파벳 확인
        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                result = (char)(i+65);
            } else if(arr[i] == max) {
                result = '?';
            }
        }
        
        System.out.print(result);
    }
}