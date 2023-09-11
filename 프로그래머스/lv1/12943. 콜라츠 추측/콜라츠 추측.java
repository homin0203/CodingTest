class Solution {
    public int solution(int num) {
        int answer = 0;
        //기본 값 빼놓기
        int dNum = num;
        
        //반복문 진행(num이 1이 아니고, 500번 반복전까지)
        while(num != 1 && answer < 500) {
            //홀수 일 경우 3곱하고 1더하기, 짝수일 경우 2나누기
            num = (num%2 == 1) ? num*3+1 : num/2;
            //반복 횟수 카운트
            answer++;
        }
        //주어진 수가 1일 경우 및 반복수가 500이상을 경우 체크
        answer = (dNum == 1) ? 0 : (answer == 500 ? -1 : answer);
        
        return answer;
    }
}