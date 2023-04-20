class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        //자릿수의 합과 계산을 위한 변수 선언 및 초기화
        int num = x;
        int sum = 0;
        
        //각 자릿수의 합 구하기 
        while(num>0) {
            sum += num%10;
            num = num/10;
        }
        
        //나눠질 경우 나머지가 0이기 때문에 아닐경우 false
        if(x%sum != 0) answer = false;
        
        return answer;
    }
}