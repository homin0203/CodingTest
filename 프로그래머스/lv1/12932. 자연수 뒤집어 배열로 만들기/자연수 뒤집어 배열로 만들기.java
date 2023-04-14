import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = null;
        
        //임시 저장을 위한 List 선언
        List<Integer> arrList = new ArrayList<Integer>(); 
        
        //1의 자릿수 값부터 하나씩 List에 추가
        while(n > 0) {
            arrList.add((int)(n%10));
            n = n/10;
        }
        
        //배열 변수 초기화 및 List의 값을 대입
        answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}