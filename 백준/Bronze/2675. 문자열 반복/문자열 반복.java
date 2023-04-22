import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allNum;
        
        //테스트 케이스 횟수
        allNum = sc.nextInt();
        
        //테스트 케이스 횟수만큼 반복
        for(int i = 0; i < allNum; i++) {
            //R,S 값 받아오기
            int num = sc.nextInt();
            String str = sc.next();
            
            //출력을 위한 문자열 변수
            String result = "";
            
            //S의 각 문자열을 R번씩 반복해서 result에 추가하기
            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < num; k++) {
                    result += str.charAt(j);
                }
            }
            //출력
            System.out.println(result);
        }   
    }
}