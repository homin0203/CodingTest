class Solution {
    public long solution(long n) {
        long answer = -1; //아닐경우 초기값 대입
    
    
        for(long i = 1; i <= n; i++) {
            if(i*i == n) { //n이 i의 제곱일 경우 i+1의 제곱 대입
                answer = (i+1)*(i+1); break;
            } else if(i*i > n) { //i의 제곱이 n을 초과할 경우 반복문 종료
                break;
            }
        }
        
        return answer;
    }
}