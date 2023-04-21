import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //반환 결과 변수 선언
        int count = 0;
        
        //배열 선언 및 초기화
        int[] arr = new int[10]; //자연수 담기
        int[] checkArr = new int[42]; //나머지 체크
        
        //10개의 자연수 가져오기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        
        //나머지에 따라 체크용 배열의 값 증가
        for(int i = 0; i < arr.length; i++) {
            checkArr[arr[i]%42]++;
        }
        
        //서로 다른 나머지 개수 카운트
        for(int i = 0; i < checkArr.length; i++) {
            if(checkArr[i] > 0) count++;
        }
        
        System.out.print(count);
    }
}