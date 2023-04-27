import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //세 개의 자연수수 가져오기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        //세 개의 자연수 곱하기
        int mul = a*b*c;
        
        //0~9까지 횟수 체크를 위한 배열 선언
        int[] arr = new int[10];
        
        //반복문을 통해 각 자릿수의 값 선별
        while(mul > 0) {
            arr[mul%10]++; //각 자릿수에 해당하는 index의 값 1증가
            mul = mul/10;
        }
        
        //출력
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}