import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //총 테스트 케이스 개수 가져오기
        int num = sc.nextInt();
        sc.nextLine();
        
        //테이스 케이스 개수 만큼 진행
        for(int i = 0; i < num; i++) {
            //퀴즈결과 문자열 받기
            String str = sc.nextLine();
            //문제별 점수용 변수
            int count = 0;
            //퀴즈 총 점수용 변수
            int score = 0;
            //문자열 길이만큼 반복
            for(int j = 0; j < str.length(); j++) {
                //결과에 따라 점수 증가 또는 0
                if(str.charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                //총 점수에 반영
                score += count;
            }
            
            System.out.println(score);
        }
    }
}