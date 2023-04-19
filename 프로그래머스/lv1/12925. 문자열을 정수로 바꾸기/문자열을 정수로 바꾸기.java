class Solution {
    public int solution(String s) {
        int answer = 0;
        
        //-부호 체크용 변수 선언 및 초기화
        boolean check = true;
        
        //문자열의 길이 만큼 반복문 진행
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') { //맨앞에 -부호 체크
                check = false;
            } else if(!(i == 0 && s.charAt(i) == '+')) {  //맨앞에 +부호 체크
                
                //(전체길이 - 인덱스)로 현재 자릿수 체크
                int num = s.length() - i;
                
                //자릿수에 따라 값 더하기
                switch(num) { 
                    case 1 : answer += Character.getNumericValue(s.charAt(i)); break;
                    case 2 : answer += 10*Character.getNumericValue(s.charAt(i)); break;
                    case 3 : answer += 100*Character.getNumericValue(s.charAt(i)); break;
                    case 4 : answer += 1000*Character.getNumericValue(s.charAt(i)); break;
                    case 5 : answer += 10000*Character.getNumericValue(s.charAt(i)); break;
                }
            }
        }
        //맨앞이 -부호인 경우 결과값의 부호 변경
        if(check == false) answer = -answer;
        
        return answer;
    }
}