import java.util.*;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //각 자리 체크 용 2차원배열 초기화
        arr = new boolean[n][m];
        
        //보드의 색상값 대입
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            for(int j = 0 ; j < m; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true; 
                } else {
                    arr[i][j] = false;
                }
            }
        } 
        
        //최솟값 구하기
        for(int i = 0; i < n-7; i++) {
            for(int j = 0 ; j < m-7; j++) {
                findMin(i,j);
            }
        } 
        
        //출력
        System.out.print(min);
        
        
    }
    
    public static void findMin(int x, int y) {
        int end_x = x+8;
        int end_y = y+8;
        int count = 0;
        
        //첫번째 칸의 값
        boolean fv = arr[x][y]; 
        
        //이번 8x8의 다시 칠해야하는 개수 체크하기
        for(int i = x; i < end_x; i++) {
            for(int j = y; j < end_y; j++) {
                if(arr[i][j] != fv) {
                    count++;
                }
                
                //다음 칸은 색상이 다르므로 변경
                fv = (!fv);
            }
            
            //다음 줄의 색은 마지막 칸과 같이 때문에 다시 변경 
            fv = (!fv);
        } 
        
        
        //방금 경우와 시작 색이 반대되는 경우 중 더 최솟값인 것을 count에 저장
        count = Math.min(count, 64-count);
        
        //방금 계산한 최솟값과 저장된 최솟값 중 더 낮은 값을 min에 저장
        min = Math.min(min, count);
    }
}