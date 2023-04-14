class Solution {
    public long[] solution(int x, int n) {
        //n 크기의 배열선언
        long[] answer = new long[n]; 
        
        //반복문 n 크기만큼 실행 
        for(int i = 0; i < n; i++) {
            answer[i] = (long)x*(i+1); //각 배열위치에 따라 x값 대입
        }
        
        return answer;
    }
}