import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //과목의 개수 가져오기
        int length = sc.nextInt();
        sc.nextLine();
        
        //과목의 개수 크기의 배열 선언
        int[] arr = new int[length];
        
        //각 과목 점수 가져오기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        //제일 높은 점수 가져오기
        double max = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        
        //새로운 점수의 총합 구하기
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i]/max*100;
        }
        
        //평균 출력
        System.out.print(sum/length);    
    }
}