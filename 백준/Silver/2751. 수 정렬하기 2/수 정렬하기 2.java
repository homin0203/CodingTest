import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        //수의 개수 가져오기
        int num = sc.nextInt();
        
        
        //각 수를 저장하기 위한 list 
        List<Integer> list = new ArrayList<Integer>(); 
        
        //각 수 list에 추가
        for(int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
        
        //오름차순 정렬
        Collections.sort(list);
        
        //출력할 값에 각 수 추가
        for(int i = 0; i < list.size(); i++) {
           sb.append(list.get(i)).append('\n');
        }
        
        //출력
		System.out.println(sb);
    }
}