class Solution {
    public long solution(long num) {
        long answer = 0;
        
        for(int i = 1; num != 1; i++) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            if (num == 1) {
                return answer = i;
            } else if (i >= 500) {
                return -1;
            } 
        }
        return answer;
    }
}