class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        
        for(int i = 0; i < sArr.length; i++) {
        	iArr[i] = Integer.parseInt(sArr[i]);
        }
        
        for(int t = 0; t < iArr.length-1; t++) {
        	for(int i = 0; i < iArr.length-1-t; i++) {
            	if(iArr[i] > iArr[i+1]) {
            		int temp = iArr[i];
            		iArr[i] = iArr[i+1];
            		iArr[i+1] = temp;
            	}
            }
        }
        answer = iArr[0] + " " + iArr[iArr.length-1];
        
        return answer;
    }
}