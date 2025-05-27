import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        int num = Arrays.asList(seoul).indexOf("Kim");
        
        String strNum = String.valueOf(num);
        
        answer = "김서방은 " + strNum + "에 있다";
        
        return answer;
    }
}