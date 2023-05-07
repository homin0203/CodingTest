import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //단어 가져오기
        String str = sc.next();
        
        //각 단어를 위치 및 존재여부를 체크하기 위한 배열
        int[] arr = new int[26];
        
        //각 알파벳 체크
        for(int i = 0; i < str.length(); i++) { //단어 길이만큼 반복
            if(arr[str.charAt(i)-97] == 0) { //해당 단어가 이미 나왓었는지 체크
                arr[str.charAt(i)-97] = i+1; //해당 단어의 처음 등장하는 위치 넣기
            }
        }
        
        //출력
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) { //단어에 미포함 알파벳은 -1 출력
                System.out.printf("%d ", -1);
            } else { //단어에 포함 알파벳은 처음 등장위치(index) 출력
                System.out.printf("%d ", arr[i]-1);
            }
        }
    }
}