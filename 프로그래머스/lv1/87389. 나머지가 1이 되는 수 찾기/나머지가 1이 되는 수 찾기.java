class Solution {
    public int solution(int n) {
        int answer = 2; //최소 소수인 2부터 시작
        
        while(n%answer != 1) { //나머지가 1이 아닐경우 반복
            answer++; //1씩 증가
        }
        
        return answer;
    }
}