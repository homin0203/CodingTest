import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //반환 결과 변수 선언
        int max = -1;
        int index = 0;
        
        //배열 선언 및 초기화
        int[] arr = new int[9];
        
        //9개의 자연수 가져오기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        
        //최대 값 및 해당 위치 가져오기
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i+1;
            }
        }
        
        System.out.println(max);
        System.out.print(index);
    }
}