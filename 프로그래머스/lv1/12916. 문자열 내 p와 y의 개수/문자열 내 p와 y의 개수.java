class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        //전체 소문자로 변환
        s = s.toLowerCase();
        
        //P,Y 개수 확인을 위한 변수 선언
        int countP = 0;
        int countY = 0;
        
        //문자열 길이만큼 반복문 진행
        for(int i = 0; i < s.length(); i++) {
            //해당 자리 문자에 따라 카운트
            switch(s.charAt(i)) { 
                case 'p' : countP++; break;
                case 'y' : countY++; break;
                default : break;    
            }
        }

        //P,Y가 모두 없는경우 및 개수 비교후 결과 리턴
        return (countP == 0 && countY == 0) ? true: (countP == countY) ? true:false;
    }
}