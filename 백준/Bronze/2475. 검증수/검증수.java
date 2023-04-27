import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        //고유번호 제곱의 합 구하기
        for(int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sum += num*num;
        }
        
        //10으로 나눈 나머지 출력
        System.out.print(sum%10);
    }
}