class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        if (phone_number.length() >= 4 && phone_number.length() <= 20) {
            
                for (int i = 0; i < phone_number.length(); i++) {
                    
                    if(i < phone_number.length() -4) {
                        
                        answer += "*";
                    } else {
                        
                        answer += String.valueOf(phone_number.charAt(i));
                }
            }
        }
        
        return answer;
    }
}