class Solution {
    public long[] solution(int x, int n) {
        long z = x;
        long[] answer = new long[n];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = z;
            z += x;
        }
        return answer;
    }
}