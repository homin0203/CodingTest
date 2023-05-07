import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //기존 알람 시간, 분 가져오기
        int hour = sc.nextInt();
        int min = sc.nextInt();
        
        //반환용 변수 선언
        int resultHour, resultMin;
        
        //출력시간 계산
        if(min - 45 < 0) {
            resultMin = min+60-45;
            resultHour = hour == 0? 23 : hour-1;
        } else {
            resultMin = min - 45;
            resultHour = hour;
        }
        
        System.out.printf("%d %d", resultHour, resultMin);
    }
}