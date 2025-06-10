class Solution {
    public String solution(int n) {
        String answer = "수";
        
        for(int i = 0; i < n - 1; i++) {
            if (answer.charAt(i) == '수') {
                answer += "박";
            }
            if (answer.charAt(i) == '박') {
                answer += "수";
            }
        }
        
        return answer;
    }
}