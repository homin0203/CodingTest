import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        //오름차순 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //일어버린 학생 및 빌려준 학생 체크를 위한 배열 및 List
        boolean[] arr = new boolean[n+2];
        List<Integer> list = new ArrayList();
        
        //잃어버린 사람 체크
        for(int i = 0; i < lost.length; i++) {
            arr[lost[i]] = true; 
        }
        //여분이 있는 잃어버린 학생 체크
        for(int i = 0; i < reserve.length; i++) {
            if(arr[reserve[i]] == true) {
                arr[reserve[i]] = false; 
                list.add(reserve[i]);
            }
        }
        
        //여분이 있는 학생 빌려주기 
        for(int i = 0; i < reserve.length; i++) {
            if(list.contains(reserve[i])) continue;
            if(arr[reserve[i]-1] == true) { // 앞번호 사람 체크
                arr[reserve[i]-1] = false;
            } else if(arr[reserve[i]+1] == true) { // 뒷번호 사람 체크
                arr[reserve[i]+1] = false;
            }
        }
        
        //최종적으로 체육복 없는 학생수 체크
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == true) count++;
        }
        
        
        return n-count;
    }
}