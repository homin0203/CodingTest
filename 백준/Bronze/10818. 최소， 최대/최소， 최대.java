import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //정수의 개수 가져오기
        int num = sc.nextInt();
        sc.nextLine();
        
        //개수 크기의 배열
        int[] arr = new int[num];
        
        //정수 배열에 받기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        //최솟값, 최댓값 변수 - 초기 첫번의 인덱스 값으로 초기화
        int max = arr[0];
        int min = arr[0];
       
        //배열안에서 최솟값, 최댓값 구하기
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
            else if(arr[i] < min) min = arr[i];
        }
        
        //출력
        System.out.printf("%d %d", min, max);
    }
}