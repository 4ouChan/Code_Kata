class Solution {
    public String solution(String s) {
        String answer = "";
        int strLength = s.length();
        
        
            answer = strLength % 2 != 0 
                ? s.substring(strLength / 2, strLength / 2 +1)
                : s.substring(strLength / 2 -1, strLength / 2 +1);
        
        
        return answer;
    }
}