class Solution {
    public int[] solution(long n) {
        
        String strN = String.valueOf(n);
        
        int[] answer = new int[strN.length()];
        
        for(int i = 0; i < strN.length(); i++) {
            
            answer[i] = Integer.parseInt(String.valueOf(strN.charAt(strN.length() - 1 -i)));
        }
        

        return answer;
    }
}