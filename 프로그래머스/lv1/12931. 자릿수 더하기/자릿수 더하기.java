import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 0) { //n이 0보다 크면 계속 반복
            answer += n%10; // 현재 일의 자릿수 값 추가
            n = n/10; //추가한 일의 자릿수 값 제거
        }
            
        return answer;
    }
}