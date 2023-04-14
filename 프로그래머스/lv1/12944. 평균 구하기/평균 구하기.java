class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        //총합 구하기
        for(int a : arr) {
            answer += a;
        }
        
        //평균값 반환
        return answer/arr.length;
    }
}