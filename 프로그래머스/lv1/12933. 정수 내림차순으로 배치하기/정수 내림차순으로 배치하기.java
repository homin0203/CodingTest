import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
    
        //각 자릿수를 담기위한 List 선언 
        List<Long> array = new ArrayList<Long>();
        
        //List에 각 자릿수 담기
        while(n>0) {
            array.add(n%10);
            n = n/10;
        }
        
        //List에 값을 내림차순으로 정렬
        Collections.sort(array, Collections.reverseOrder());
        
        //List에 각 숫자를 String으로 순서대로 붙이기
        for(int i = 0; i < array.size(); i++) {
            answer += Long.toString(array.get(i));
        }
        
        //Long타입으로 변환해서 반환
        return Long.parseLong(answer);
    }
}